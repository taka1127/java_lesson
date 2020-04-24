package sample_02;

public class Main {

	public static void main(String[] args) {

//		Cleric c = new Cleric();
//
//		c.name = "test";
//
//		c.selfAid();
//		c.pray(1);
		
		Thief t1 = new Thief("テストさん", 20, 10);
		System.out.println(t1.name + t1.hp + t1.mp);
		
		Thief t2 = new Thief("ダミー");
		System.out.println(t2.name+ t2.hp + t2.mp);


	}

}
