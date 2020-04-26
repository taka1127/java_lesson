package sample_01;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		SuperHero sh1 = new SuperHero();
		PoisonMatango m1 = new PoisonMatango('A');

		m1.attack(h);
		sh1.attacker(m1);
		h.attack(m1);
	}


}
