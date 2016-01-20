package exercise1;

import java.util.Scanner;

public class InsuranceCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = null;
		
		//Accept input
		System.out.println("Please enter number of boxes:");
		input = scanner.next();
		
		try{
			int numOfBoxes = Integer.parseInt(input);
			for (int i=0; i<numOfBoxes ; i++){
				input = scanner.next();
				
			}
			
			
		}catch(NumberFormatException e){
			System.out.println("Something went wrong with input transformation");
			System.out.println(e);
		}
		

		scanner.close();
	}

}
