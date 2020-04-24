package sample_01;

public class Main {

	public static void main(String[] args) {

		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 50;

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 200;

		System.out.println("勇者" +h1.name+ "を生み出しました！");
		System.out.println("勇者" +h2.name+ "を生み出しました！");

		w.heal(h1);
		w.heal(h1);
		w.heal(h2);


		//Matangoを生成
		Matango m1 = new Matango();
		//Matangoのフィールドに初期値をセット
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';


//		Sword s = new Sword();//剣インスタンス生成
//		s.name = "炎の剣";
//		s.damege = 5;
//		h.sword = s; //剣インスタンス情報をHeroインスタンスのswordにコピー
//		System.out.println("現在の武器は"+h.sword.name);



		//Heroのメソッドを呼び出し
//		h.attack();
//		h.sit(5);
//		h.slip();
//		h.sleep();
		//Matangoメソッドの呼び出し
//		m1.run();
//		m2.run();
//		h.sit(25);
//		h.run();
	}

}
