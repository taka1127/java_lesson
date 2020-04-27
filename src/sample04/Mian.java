package sample04;

public class Mian {

	public static void main(String[] args) {
		
		Y array[] = new Y[2];
		
		array[0] = new A();
		array[1] = new B();
		
		for(Y y : array) {
			y.a();
			y.b();
			if(y instanceof A ) {
				A a = (A)y;
				a.c();
			}
			if(y instanceof B ) {
				B b = (B)y;
				b.c();
			}
		}

	}

}
