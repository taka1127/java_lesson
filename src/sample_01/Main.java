package sample_01;

public class Main {

	public static void main(String[] args) {
		//Heroを生成
		Hero h = new Hero();
		//Heroのフィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" +h.name+ "を生み出しました！");

		//Matangoを生成
		Matango m1 = new Matango();
		//Matangoのフィールドに初期値をセット
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		//Heroのメソッドを呼び出し
		h.attack();
		h.sit(5);
		h.slip();
		h.sleep();
		//Matangoメソッドの呼び出し
		m1.run();
		m2.run();
		h.sit(25);
		h.run();
	}

}
