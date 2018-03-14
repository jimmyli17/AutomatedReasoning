public class LandTTKB extends KB{
		static Prover1 proof = new Prover1();
		Model_imp x = new Model_imp();
		public LandTTKB(){
			super();
				Symbol a = intern("A");
				Symbol b = intern("B");
				Symbol c = intern("C");
				add(new Implication(a, new Conjunction(a, c)));
				add(new Implication(b, new Negation(c)));
				add(new Implication(c, new Disjunction(b, new Negation(a))));
			}
		
		
		public static void LDriver() {
			new LandTTKB().dump();
			LandTTKB kb = new LandTTKB();
			//(a) Can we prove that the unicorn is mythical?
			Symbol a = intern("A");
			System.out.println("is Amy telling the Truth?");
			System.out.println(proof.entails(kb, a));
			System.out.println(proof.PL_Resolution(kb, a));
			System.out.println();
			//(b) Can we prove that the unicorn is magical?
			Symbol b = intern("B");
			System.out.println("is Bob telling the Truth?");
			System.out.println(proof.entails(kb, b));
			System.out.println(proof.PL_Resolution(kb, b));
			System.out.println();
			//(c) Can we prove that the unicorn is horned?
			Symbol c = intern("C");
			System.out.println("is Cal telling the Truth?");
			System.out.println(proof.entails(kb, c));
			System.out.println(proof.PL_Resolution(kb, c));
		}
	
		public static void main(String[] args) {
			new LandTTKB().dump();
			LandTTKB kb = new LandTTKB();
			//(a) Can we prove that the unicorn is mythical?
			Symbol a = intern("A");
			System.out.println(proof.entails(kb, a));
			System.out.println(proof.PL_Resolution(kb, a));
			System.out.println();
			//(b) Can we prove that the unicorn is magical?
			Symbol b = intern("B");
			System.out.println(proof.entails(kb, b));
			System.out.println(proof.PL_Resolution(kb, b));
			System.out.println();
			//(c) Can we prove that the unicorn is horned?
			Symbol c = intern("C");
			System.out.println(proof.entails(kb, c));
			System.out.println(proof.PL_Resolution(kb, c));
		}
	}

