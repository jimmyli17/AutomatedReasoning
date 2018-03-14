

public class WumpusWorldKB extends KB {
	Model_imp x = new Model_imp();
	static Prover1 proof = new Prover1();
	public WumpusWorldKB() {
		super();
		Symbol p11 = intern("P1,1");
		Symbol p12 = intern("P1,2");
		Symbol p21 = intern("P2,1");
		Symbol p22 = intern("P2,2");
		Symbol p31 = intern("P3,1");
		Symbol b11 = intern("B1,1");
		Symbol b21 = intern("B2,1");

		add(new Negation(p11));
		add(new Biconditional(b11, new Disjunction(p12, p21)));
		add(new Biconditional(b21, new Disjunction(p11, new Disjunction(p22, p31))));
		add(new Negation(b11));
		add(b21);
		//add(p11);
	}
	
	public static void WPDriver() {
		new WumpusWorldKB().dump();
		Symbol p12 = intern("P1,2");
		WumpusWorldKB kb = new WumpusWorldKB();
		System.out.println("Is there a pit at location [1, 2]?");
		System.out.println("Basic Model Checking: " + proof.entails(kb, p12));
		System.out.println("Resolution: " +proof.PL_Resolution(kb, p12));
	}
	
	public static void main(String[] argv) {
		new WumpusWorldKB().dump();
		Symbol p12 = intern("P1,2");
		WumpusWorldKB kb = new WumpusWorldKB();
		System.out.println(proof.entails(kb, p12));
		System.out.println(proof.PL_Resolution(kb, p12));
	}

}
