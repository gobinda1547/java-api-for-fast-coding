package test;

import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("gobinda", 20000);
		map.put("sourav", 25000);
		map.put("shamim", 30000);

		System.out.println("map = " + map);
		System.out.println();

		System.out.println("Is key(joy) exist -> " + map.containsKey("joy"));
		System.out.println("Is key(gobinda) exist -> " + map.containsKey("gobinda"));
		System.out.println();

		System.out.println("Is value(30000) exist -> " + map.containsValue(30000));
		System.out.println("Is value(10000) exist -> " + map.containsValue(10000));
		System.out.println();

		System.out.println("Getting item -> " + map.get("gobinda"));
		System.out.println("Getting item -> " + map.get("joy"));
		System.out.println();

		System.out.println("isEmpty = " + map.isEmpty());
		System.out.println();

		System.out.println("size = " + map.size());
		System.out.println();

		System.out.println("putIfAbsent(gobinda)");
		map.putIfAbsent("gobinda", 5000);
		System.out.println("map = " + map);
		System.out.println();

		System.out.println("putIfAbsent(joy)");
		map.putIfAbsent("joy", 5000);
		System.out.println("map = " + map);
		System.out.println();

		System.out.println("replace(joy -> 6000)");
		map.replace("joy", 6000);
		System.out.println("map = " + map);
		System.out.println();

		System.out.println("replace(tushar -> 4000)");
		map.replace("tushar", 4000);
		System.out.println("map = " + map);
		System.out.println();

		System.out.println("remove(tushar)");
		map.remove("tushar");
		System.out.println("map = " + map);
		System.out.println();

		System.out.println("remove(shamim)");
		map.remove("shamim");
		System.out.println("map = " + map);
		System.out.println();

		System.out.println("computeIfAbsent");
		map.computeIfAbsent("raju", (k) -> 40);
		System.out.println("map = " + map);
		System.out.println();

		System.out.println("computeIfPresent");
		map.computeIfPresent("raju", (k, v) -> v + 10);
		System.out.println("map = " + map);
		System.out.println();

		System.out.println("key items printing.. 1");
		ArrayList<String> keyItems = new ArrayList<>(map.keySet());
		for (String item : keyItems) {
			System.out.println(item);
		}
		System.out.println();

		System.out.println("key items printing.. 2");
		for (String item : map.keySet()) {
			System.out.println(item);
		}
		System.out.println();

		System.out.println("value items printing.. 1");
		ArrayList<Integer> valueItems = new ArrayList<>(map.values());
		for (int value : valueItems) {
			System.out.println(value);
		}
		System.out.println();

		System.out.println("value items printing.. 2");
		for (int value : map.values()) {
			System.out.println(value);
		}
		System.out.println();

		System.out.println("printing all the items..");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
		}
		System.out.println();

	}

}
