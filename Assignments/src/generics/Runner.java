package generics;

import java.util.ArrayList;

/**
 * @author CraftMojo
 * Modified Date: Oct 29, 2018
 */

public class Runner {

	public static void main(String[] args) {
		ArrayList<Integer> items = new ArrayList<>();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);

		printItem(items);
	}

	private static void printItem(ArrayList<Integer> n) {
		for (int i : n) {
			System.out.println(i * 2);
		}
	}
}
