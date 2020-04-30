package sample08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i= 0; i < 100; i++) {
			sb.append(i + 1).append(",");
		}
		String s = sb.toString();
		String[] a = s.split(",");
		for (String w : a) {
			System.out.println(w + "->");
		}
		
		System.out.println(s);

		LocalDate now = LocalDate.now();
	    LocalDate future = now.plusDays(2);
	    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
	    System.out.println(future.format(fmt));
		
	}

}
