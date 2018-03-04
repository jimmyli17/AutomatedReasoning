

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Prover1 implements Prover{

	@Override
	public boolean entails(KB kb, Sentence alpha) {
			
			//Collection<Symbol> sym = kb.symbols();
			Model_imp m = new Model_imp(); 
			List<Symbol> sym = new ArrayList<Symbol>();
			//sym.add((Symbol) alpha);
			sym.addAll(kb.symbols());
			return Check(kb, alpha, sym, m);
	}
	
	public boolean Check(KB kb, Sentence s, List<Symbol> sym, Model_imp m){
		
		if(sym.isEmpty()) {
			m.dump();
			if(m.satisfies(kb)) {
				return m.satisfies(s);
			}
			else {
				
				return true;
			}
		}
		else {
			Symbol P = sym.get(0);
			List<Symbol> rest =  sym.subList(1, sym.size());
			//System.out.println("check again");
			return  Check(kb, s, rest, m.set(P, false))&&(Check(kb, s, rest, m.set(P, true)) );
		}
	}
	
}


