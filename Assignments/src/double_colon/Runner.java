package double_colon;

import java.util.function.Function;

/**
 * @author CraftMojo
 * Modified Date: Oct 29, 2018
 */

public class Runner {
	public static void main(String[] args) {
		Function<Double, Double> square = (Double x) -> x * x * x;
		System.out.println(square.apply(11d));
		
//		Function<Integer, Integer> add = (Integer a, Integer b) -> a + b;
//		System.out.println(add.apply(56));


	}
}