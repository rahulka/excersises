package fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciRecursiveTest {

	@Test
	public void testfibonacciOutputForInput0() {
		assertEquals(0, FibonacciRecursive.fibonacci(0));
	}
	
	@Test
	public void testfibonacciOutputForInput3() {
		assertEquals(2, FibonacciRecursive.fibonacci(3));
	}
	
	@Test
	public void testfibonacciOutputForInput5() {
		assertEquals(5, FibonacciRecursive.fibonacci(5));
	}
	
	@Test
	public void testfibonacciOutputForInput15() {
		assertEquals(610, FibonacciRecursive.fibonacci(15));
	}

	@Test
	public void testfibonacciOutputForInput30() {
		assertEquals(832040, FibonacciRecursive.fibonacci(30));
	}
	
}
