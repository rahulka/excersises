package fibonacci;

import java.util.Scanner;

public class FibonacciRecursive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = null;

		// Accept input
		System.out.println("Please enter length of the fibonacci series you want:");
		input = scanner.next();
		int length = Integer.parseInt(input);
		if(length > 0){
			System.out.println("Fibonacci series:");
			for (int i = 0; i < length; i++) {
				System.out.print(fibonacci(i) + " ");
				
			}
		}
		scanner.close();
	}
	
	public static int fibonacci(int len){
		if(len == 0){
			return 0;
		}else if(len == 1){
			return 1;
		}else{
			return fibonacci(len - 1) + fibonacci(len - 2);
		}
		
	}
}
