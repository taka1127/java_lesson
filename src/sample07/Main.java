package sample07;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

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

		System.out.println("\n--------------------------------------------------------");

		// 処理前の時刻を取得
        long startTime = System.currentTimeMillis();

        // 時間計測をしたい処理
        int result = 0;
        for (int i = 0; i < 1000000; i++) {
            result += 1;
        }

        // 処理後の時刻を取得
        long endTime = System.currentTimeMillis();

        System.out.println("開始時刻：" + startTime + " ms");
        System.out.println("終了時刻：" + endTime + " ms");
        System.out.println("処理時間：" + (endTime - startTime) + " ms");

        System.out.println("--------------------------------------------------------");

        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1600705425827L);
        System.out.println(past);

        System.out.println("--------------------------------------------------------");

        Calendar c  = Calendar.getInstance();
        c.set(2020, 8, 22, 1, 23, 45);
        c.set(Calendar.MONTH, 9);
        Date d = c.getTime();
        System.out.println(d);
        Date now1 = new Date();
        c.setTime(now1);
        int y = c.get(Calendar.YEAR);
        System.out.println("今年は"+y+"年です");

        System.out.println("--------------------------------------------------------");

        Instant i1 = Instant.now();
        Instant i2 = Instant.ofEpochMilli(1600705425827L);
        long l = i2.toEpochMilli();

        ZonedDateTime z1 = ZonedDateTime.now();
        ZonedDateTime z2 = ZonedDateTime.of(2020, 1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));

        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        System.out.println("東京：" + z2.getYear()+z2.getMonth() + z2.getDayOfMonth());
        System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
        if(z2.isEqual(z3)) {
        	System.out.println("これらは同じ瞬間を指しています");
        }

	}

}
