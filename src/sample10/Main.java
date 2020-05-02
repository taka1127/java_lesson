package sample10;

public class Main {

	public static void main(String[] args)  {
////		System.out.println("プログラムが起動しました");
//	    throw new IOException();
		
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("data.txt");
//			fw.write("hello!");
////			fw.close();
//		} catch (IOException e) {
//			System.out.println("書き込み失敗");
//			
//		} finally {
//			fw.close();
//		}
		Person p = new Person();
		p.setAge(-128);
		System.out.println(p.age);
	}
	

}
