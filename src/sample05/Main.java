package sample05;

public class Main {

	public static void main(String[] args) {
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Empty e = new Empty();
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;
		h1.money +=20;
		h2.money -=20;
		
		if(h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}
		
		System.out.println(h1);
		System.out.println(h1.equals(e));
		System.out.println(h1.hashCode());
		System.out.println(Hero.money);
		System.out.println(Hero.class);

	}

}
