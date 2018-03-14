
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
		//add(new Biconditional(mortal, mammal));
		add(new Implication(mythical, new Negation(mortal)));
		add(new Implication(new Negation(mythical), new Conjunction(mammal, mortal)));
		add(new Implication(new Disjunction(new Negation(mortal), mammal),horned));
		add(new Implication(horned, magical));
	}
	
	public static void HCDriver() {
		new HornClausesKB().dump();
		HornClausesKB kb = new HornClausesKB();
		//(a) Can we prove that the unicorn is mythical?
		Symbol mythical = intern("mythical");
		System.out.println("Can we prove that the unicorn is mythical? ");
		System.out.println("Basic Model Checking: " +proof.entails(kb, mythical));
		System.out.println("Resolution: " +proof.PL_Resolution(kb, mythical));
		System.out.println();
		//(b) Can we prove that the unicorn is magical?
		Symbol magical = intern("magical");
		System.out.println("Can we prove that the unicorn is magical? ");
		System.out.println("Basic Model Checking: " +proof.entails(kb, magical));
		System.out.println("Resolution: " +proof.PL_Resolution(kb, magical));
		System.out.println();
		//(c) Can we prove that the unicorn is horned?
		Symbol horned = intern("horned");
		System.out.println("Can we prove that the unicorn is horned? ");
		System.out.println("Basic Model Checking: " +proof.entails(kb, horned));
		System.out.println("Resolution: " +proof.PL_Resolution(kb, horned));
	}
	
	public static void main(String[] args) {
		new HornClausesKB().dump();
		HornClausesKB kb = new HornClausesKB();
		//(a) Can we prove that the unicorn is mythical?
		Symbol mythical = intern("mythical");
		System.out.println(proof.entails(kb, mythical));
		System.out.println(proof.PL_Resolution(kb, mythical));
		System.out.println();
		//(b) Can we prove that the unicorn is magical?
		Symbol magical = intern("magical");
		System.out.println(proof.entails(kb, magical));
		System.out.println(proof.PL_Resolution(kb, magical));
		System.out.println();
		//(c) Can we prove that the unicorn is horned?
		Symbol horned = intern("horned");
		System.out.println(proof.entails(kb, horned));
		System.out.println(proof.PL_Resolution(kb, horned));
	}
}