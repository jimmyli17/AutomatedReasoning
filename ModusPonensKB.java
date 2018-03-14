
import java.util.Collection;

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
	
	public static void MPDriver() {
		new ModusPonensKB().dump();
		ModusPonensKB kb = new ModusPonensKB();
		Symbol q = intern("Q");
		System.out.println("Does q entail if we know that p implies q and p is true?");
		System.out.println("Basic Model Checking: " + proof.entails(kb, q));
		System.out.println("Resolution: " + proof.PL_Resolution(kb, q));
	}
	
	public static void main(String[] argv) {
		new ModusPonensKB().dump();
		ModusPonensKB kb = new ModusPonensKB();
		Symbol q = intern("Q");
		System.out.println(proof.entails(kb, q));
		System.out.println(proof.PL_Resolution(kb, q));
	}

}
