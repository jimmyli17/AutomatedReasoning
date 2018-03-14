
import java.util.HashMap;
import java.util.Map;
public class Model_imp implements Model{

	HashMap <Symbol, Boolean> symbols = new HashMap<Symbol, Boolean>();
	
	@Override
	public Model_imp set(Symbol sym, boolean value) {

		sym.truth = value;
		this.symbols.put(sym, value);
		return this;
	}

	@Override
	public boolean get(Symbol sym) {

		return sym.truth;
	}

	@Override
	public boolean satisfies(KB kb) {
		
		boolean satisfies = true;
		for(Sentence S: kb.sentences) {
			
			if(S.isSatisfiedBy(this)==false){
				satisfies =  false;
			}
		}
		return satisfies;
	}

	@Override
	public boolean satisfies(Sentence sentence) {

		return sentence.isSatisfiedBy(this);
	}

	@Override
	
	public void dump() {
		for(Symbol s: symbols.keySet()) {
			System.out.print(" " + s.name + " " + symbols.get(s));
		}
		System.out.println();
	}

	
}
