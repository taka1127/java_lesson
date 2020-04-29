package sample06;

public class Main {

	public static void main(String[] args) {
		Account a = new Account();
		Account o = new Account();
		
		a.accountNumber = "4649";
		a.balance = 1592;
		o.accountNumber = "   4649";
		
		System.out.println(a);
		
		if(a.equals(o) == true) {
			System.out.println(o.accountNumber + "：正しいです");
		}else {
			System.out.println(o.accountNumber + ":口座番号が違います");
		}

		System.out.println(a.equals(o));
		
	}

}
