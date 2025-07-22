package com.cts.oopdemo;

import java.util.Map;
import java.util.TreeMap;

public class App13MapsDemo {

	public static void main(String[] args) {

		Map<String, Integer> scores = new TreeMap<>();

		scores.put("Lang1", 89);
		scores.put("Lang2", 99);
		scores.put("Lang3", 79);
		scores.put("Maths", 100);
		scores.put("Secience", 89);
		scores.put("Social", 74);

		double total = 0;

		for (String sub : scores.keySet()) {
			System.out.println(sub + "\t" + scores.get(sub));
			total += scores.get(sub);
		}

		System.out.println("---------------------------");
		System.out.println("Total \t" + total);
		System.out.println("Avg \t" + total / scores.size());
		System.out.println("---------------------------");
	}

}
