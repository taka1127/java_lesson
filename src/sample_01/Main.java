package sample_01;

public class Main {

	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		Hero h1 = new Hero();
		Wand wa1 = new  Wand();


		wa1.setName("abbb");
		wa1.setPower(20);
		w1.setName("ヤマモト");
		w1.setHp(10);
		w1.setMp(5);
		w1.setWand(wa1);
		h1.setName("テスト");
		h1.setHp(30);
		w1.heal( h1);
	}


}
