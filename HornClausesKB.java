


public class HornClausesKB extends KB {
	static Prover1 proof = new Prover1();
	Model_imp x = new Model_imp();
	public HornClausesKB(){
		super();
		Symbol mythical = intern("mythical");
		Symbol mortal = intern("mortal");
		Symbol mammal = intern("mammal");
		Symbol horned = intern("horned");
		Symbol magical = intern("magical");
		add(new Biconditional(mortal, mammal));
		add(new Implication(mythical, new Negation(mortal)));
		add(new Implication(new Negation(mythical), mammal));
		add(new Implication(new Disjunction(new Negation(mortal), mammal),horned));
		add(new Implication(horned, magical));
	}
	public static void main(String[] args) {
		new HornClausesKB().dump();
		HornClausesKB x = new HornClausesKB();
		//(a) Can we prove that the unicorn is mythical?
		Symbol mythical = intern("mythical");
		System.out.println(proof.entails(x, mythical));
		System.out.println();
		//(b) Can we prove that the unicorn is magical?
		Symbol magical = intern("magical");
		System.out.println(proof.entails(x, magical));
		System.out.println();
		//(c) Can we prove that the unicorn is horned?
		Symbol horned = intern("horned");
		System.out.println(proof.entails(x, horned));
	}
}