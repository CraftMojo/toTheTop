package double_colon;

import java.util.function.Function;

/**
 * @author CraftMojo
 * Modified Date: Oct 29, 2018
 */

public class Runner {
	public void lambda(Lambda lambdas) {
		lambdas.perform();
	}

	public static void main(String[] args) {
		Function<Double, Double> square = x -> x * x * x;
		System.out.println(square.apply(11d));
		
		// runnable
		Thread abc = new Thread(() -> System.out.println("Printed Lambda"));
		abc.run();

		Lambda xyz = () -> System.out.println("Printed Lambda by Interface");
		xyz.perform();
		
		Runner abcd = new Runner();
		abcd.lambda(() -> System.out.println("Hello World!"));

		mno uyy = () -> System.out.println("Printed Lambda by Interface Inline");
		uyy.perform();
	}
}

@FunctionalInterface
interface mno {
	public void perform();
}