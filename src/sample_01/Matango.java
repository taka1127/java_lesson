package sample_01;

public class Matango {
	int hp = 50;
	final int LEVEL = 10;
	char suffix;

	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃！");
		System.out.println("10のダメージを与えた");
		h.hp -= 10;
	}

	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}

}
