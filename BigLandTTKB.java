public class BigLandTTKB extends KB{

	static Prover1 proof = new Prover1();
	Model_imp x = new Model_imp();
	public BigLandTTKB(){
			super();
			Symbol a = intern("A");
			Symbol b = intern("B");
			Symbol c = intern("C");
			Symbol d = intern("D");
			Symbol e = intern("E");
			Symbol f = intern("F");
			Symbol g = intern("G");
			Symbol h = intern("H");
			Symbol i = intern("I");
			Symbol j = intern("J");
			Symbol k = intern("K");
			Symbol l = intern("L");
			add(new Implication(a, new Conjunction(h, i)));
			add(new Implication(b, new Conjunction(a, l)));
			add(new Implication(c, new Conjunction(b, g)));
			add(new Implication(d, new Conjunction(e, l)));
			add(new Implication(e, new Conjunction(c, h)));
			add(new Implication(f, new Conjunction(d, i)));
			add(new Implication(g, new Conjunction(new Negation(e), new Negation(j))));
			add(new Implication(h, new Conjunction(new Negation(f), new Negation(k))));
			add(new Implication(i, new Conjunction(new Negation(g), new Negation(k))));
			add(new Implication(j, new Conjunction(new Negation(a), new Negation(c))));
			add(new Implication(k, new Conjunction(new Negation(d), new Negation(f))));
			add(new Implication(l, new Conjunction(new Negation(b), new Negation(j))));
			
		}
	
	public static void BLDriver() {
		new BigLandTTKB().dump();
		BigLandTTKB kb = new BigLandTTKB();
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
		System.out.println("is C telling the Truth?");
		System.out.println(proof.entails(kb, c));
		System.out.println(proof.PL_Resolution(kb, c));
		
		Symbol d = intern("D");
		System.out.println("is D telling the Truth?");
		System.out.println(proof.entails(kb, d));
		System.out.println(proof.PL_Resolution(kb, d));
		System.out.println();
		
		Symbol e = intern("E");
		System.out.println("is D telling the Truth?");
		System.out.println(proof.entails(kb, e));
		System.out.println(proof.PL_Resolution(kb, e));
		System.out.println();
		
		Symbol f = intern("F");
		System.out.println("is F telling the Truth?");
		System.out.println(proof.entails(kb, f));
		System.out.println(proof.PL_Resolution(kb, f));
		System.out.println();
		
		Symbol g = intern("G");
		System.out.println("is G telling the Truth?");
		System.out.println(proof.entails(kb, g));
		System.out.println(proof.PL_Resolution(kb, g));
		System.out.println();
		
		Symbol h = intern("H");
		System.out.println("is H telling the Truth?");
		System.out.println(proof.entails(kb, h));
		System.out.println(proof.PL_Resolution(kb, h));
		System.out.println();
		
		Symbol i = intern("I");
		System.out.println("is I telling the Truth?");
		System.out.println(proof.entails(kb, i));
		System.out.println(proof.PL_Resolution(kb, i));
		System.out.println();
		
		Symbol j = intern("J");
		System.out.println("is J telling the Truth?");
		System.out.println(proof.entails(kb, j));
		System.out.println(proof.PL_Resolution(kb, j));
		System.out.println();
		
		Symbol k = intern("K");
		System.out.println("is K telling the Truth?");
		System.out.println(proof.entails(kb, k));
		System.out.println(proof.PL_Resolution(kb, k));
		System.out.println();
		
		Symbol l = intern("L");
		System.out.println("is L telling the Truth?");
		System.out.println(proof.entails(kb, l));
		System.out.println(proof.PL_Resolution(kb, l));
		System.out.println();
	}
	
	public static void main(String[] args) {
		new BigLandTTKB().dump();
		BigLandTTKB kb = new BigLandTTKB();
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
		
		Symbol d = intern("D");
		System.out.println(proof.entails(kb, d));
		System.out.println(proof.PL_Resolution(kb, d));
		System.out.println();
		
		Symbol e = intern("E");
		System.out.println(proof.entails(kb, e));
		System.out.println(proof.PL_Resolution(kb, e));
		System.out.println();
		
		Symbol f = intern("F");
		System.out.println(proof.entails(kb, f));
		System.out.println(proof.PL_Resolution(kb, f));
		System.out.println();
		
		Symbol g = intern("G");
		System.out.println(proof.entails(kb, g));
		System.out.println(proof.PL_Resolution(kb, g));
		System.out.println();
		
		Symbol h = intern("H");
		System.out.println(proof.entails(kb, h));
		System.out.println(proof.PL_Resolution(kb, h));
		System.out.println();
		
		Symbol i = intern("I");
		System.out.println(proof.entails(kb, i));
		System.out.println(proof.PL_Resolution(kb, i));
		System.out.println();
		
		Symbol j = intern("J");
		System.out.println(proof.entails(kb, j));
		System.out.println(proof.PL_Resolution(kb, j));
		System.out.println();
		
		Symbol k = intern("K");
		System.out.println(proof.entails(kb, k));
		System.out.println(proof.PL_Resolution(kb, k));
		System.out.println();
		
		Symbol l = intern("L");
		System.out.println(proof.entails(kb, l));
		System.out.println(proof.PL_Resolution(kb, l));
		System.out.println();
	}
}
