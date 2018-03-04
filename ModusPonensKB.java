

import java.util.Collection;

import pl.core.*;

public class ModusPonensKB extends KB {
	
	static Prover1 proof = new Prover1();
	
	Model_imp x = new Model_imp();
	public ModusPonensKB() {
		super();
		Symbol p = intern("P");
		Symbol q = intern("Q");
		//add(new Negation(q));
		add(p);
		add(new Implication(p, q));
		
	}
	
	public static void main(String[] argv) {
		new ModusPonensKB().dump();
		ModusPonensKB x = new ModusPonensKB();
		Symbol q = intern("Q");
		System.out.println(proof.entails(x, q));
	}

}
