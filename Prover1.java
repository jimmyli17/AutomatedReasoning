

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Prover1 implements Prover{

	@Override
	public boolean entails(KB kb, Sentence alpha) {
			
			Model_imp m = new Model_imp(); 
			List<Symbol> sym = new ArrayList<Symbol>();
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
			return  Check(kb, s, rest, m.set(P, false))&&(Check(kb, s, rest, m.set(P, true)) );
		}
	}

// 	public Set<Clause> deepCopy(Set<Clause> real) {
// 		Set<Clause> copy = new ArraySet<Clause>();
// 		copy.addAll(real);
// 		return copy;
// 	}
	
	//inputs: kb, the knowledge base, a sentence in propositional logic
	//alpha, the query, a sentence in propositional logic
	public boolean PL_Resolution(KB kb, Sentence alpha){
		Set <Clause> notAlpha = CNFConverter.convert(new Negation(alpha));
		Set <Clause> clauses = CNFConverter.convert(kb);
		clauses.addAll(notAlpha);
		Set <Clause> newClauses = new HashSet<Clause>();
		while (true){
			for(Clause Ci : clauses) {
				for(Clause Cj : clauses) {
					if(!Ci.equals(Cj)) {
						Set <Clause> resolvents;
						resolvents = PL_Resolve(Ci, Cj);
						for(Clause Ck: resolvents){
							if (Ck.isEmpty()){
								return true;
							}
						}
						newClauses.addAll(resolvents);
					}
				}
			}
			if (clauses.containsAll(newClauses)){
				return false;
			}
			clauses.addAll(newClauses);
		}
	}
	
	public Set<Clause> PL_Resolve(Clause A, Clause B){
		Set<Clause> ret = new HashSet<Clause>(); 
		Clause localA = A.clone();
		Clause localB = B.clone();
		Iterator<Literal> iteratorA = A.iterator();
		Iterator<Literal> iteratorB = B.iterator();
		while(iteratorA.hasNext()){
			Literal a = iteratorA.next();
			while(iteratorB.hasNext()){
				Literal b = iteratorB.next();
				if (a.getContent().equals(b.getContent()) && a.getPolarity() != b.getPolarity()){
					localA.remove(a);
					localB.remove(b);
					Clause localC = localA.clone();
					localC.addAll(localB);
					ret.add(localC);
				}
			}
		}
		return ret;
	}
}

	

