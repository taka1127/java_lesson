package sample07;

public class Main {

	public static void main(String[] args) {
		//文字列調査
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3  = "java";
		
		if( s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if(s2.equalsIgnoreCase(s3) ) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");

		if(s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
		if(s1.isBlank() ) {
			System.out.println("s1は空文字です");
		}
		
		System.out.println("--------------------------------------------------------");
		//文字列検索
		String s4 = "JavaScript and Java";
		if(s4.contains("Java")) {
			System.out.println("文字列s4は、Javaを含んでいます");
		}else {
			System.out.println("文字列s4は、Javaを含んでいません");
		}
		if(s4.endsWith("Java")) {
			System.out.println("文字列s4は、Javaが末尾にあります");
		}else {
			System.out.println("文字列s4は、Javaは末尾にありません");
		}
		System.out.println("文字列s4で最初にJavaが登場する位置は" + s4.indexOf("Java"));
		System.out.println("文字列s4で最後にJavaが登場する位置は" + s4.lastIndexOf("Java"));
		
		System.out.println("--------------------------------------------------------");
		//文字列引き出し
		String s5 = "Java programming";
		System.out.println("文字列s5の4文字目以降は" + s5.substring(3));
		System.out.println("文字列s5の4～8文字目は" + s5.substring(3, 8));
		System.out.println("文字列s5の4文字目は" + s5.charAt(3));
		
		System.out.println("--------------------------------------------------------");
		//正規表現
		
		String s6 = "Java";
		if(s6.matches("Java")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if(s6.matches("JavaJava")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if(s6.matches("java")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if(s6.matches("J..a")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if("Jaaaaaaava".matches("Ja*va")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//[.*]すべて許可
		if("あいうxx019".matches(".*")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//a~zのいずれか3文字を比較.  \\wも可
		if("url".matches("[a-z]{3}")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("--------------------------------------------------------");
		//文字列分割
		String s7 = "abc@def?ghi";
		String[] words = s7.split("[@?]");
		for (String w : words) {
			System.out.print(w + "->");
		}
		System.out.println("\n--------------------------------------------------------");
		String s8 = "abc@def?ghi";
		String w2 = s8.replaceAll("[@?]", "YYY");
		System.out.println(s8+"   の[@?]を[YYY]に置き換え\n"+w2);
		
	}

}
