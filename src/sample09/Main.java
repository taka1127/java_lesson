package sample09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> points = new ArrayList<>();
		points.add(10);
		points.add(80);
		points.add(75);

		for(int i : points) {
			System.out.println(i);
		}

		int[] point = {11,12,13};

		for(int i = 0; i < point.length; i++) {
			System.out.println(point[i]);
		}

		for(int i = 0; i < points.size(); i++) {
			System.out.println(points.contains(17));
		}
		
		
		ArrayList<String> names = new ArrayList<>();
		names.add("a");
		names.add("b");
		names.add("c");
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		System.out.println("------------------------------------------");
		
		//Setコレクション
		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		for(String s : colors) {
			System.out.print(s+"→");
		}
		System.out.println("\n------------------------------------------");
		Set<String> words = new TreeSet<>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for(String s : words) {
			System.out.print(s+"→");
		}
		System.out.println("\n------------------------------------------");
		
		//Map
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		for(String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は：" + value);
		}
		
//		int tokyo = prefs.get("東京都");
//		System.out.println("東京都の人口は："+ tokyo);
//		prefs.remove("京都府");
//		prefs.put("熊本県", 185);
//		int kumamoto  = prefs.get("熊本県");
//		System.out.println("熊本県の人口は：" + kumamoto);
		

	}

}
















