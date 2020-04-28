package sample_01;

public class PoisonMatango extends Matango {

	int poisonCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);
		if(poisonCount > 0) {
			System.out.println("さらに毒の胞子をまいた");
			int dmg = h.getHp() / 5;
			h.setHp(h.getHp() - dmg);
			System.out.println(dmg+ "のダメージ！");
			this.poisonCount --;
		}
	}

}
