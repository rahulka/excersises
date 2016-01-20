package exercise1;

import java.math.BigDecimal;
import java.util.Scanner;

public class InsuranceCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = null;
		
		//Accept input
		System.out.println("Please enter number of boxes:");
		input = scanner.next();
		
		System.out.println("Please enter weight of"+ input +" boxes in whole numbers:");
		try{
			Integer numOfBoxes = new BigDecimal(input).intValue();
			BigDecimal weightOfBox = BigDecimal.ZERO, maxWeightOfBox = BigDecimal.ZERO, totalInsurance = BigDecimal.ZERO;
			for (int i=0; i<numOfBoxes ; i++){
				input = scanner.next();
				weightOfBox = new BigDecimal(input);
				if (weightOfBox.intValue() > maxWeightOfBox.intValue()){
					maxWeightOfBox = weightOfBox;
				}
				totalInsurance = totalInsurance.add(weightOfBox.multiply(new BigDecimal("2")));
			}
			
			totalInsurance = totalInsurance.add(maxWeightOfBox.multiply(new BigDecimal("1.5")));
			
			System.out.println("Total insurance:"+totalInsurance);
		}catch(NumberFormatException e){
			System.out.println("Something went wrong with input transformation");
			System.out.println(e);
		}
		

		scanner.close();
	}

}
