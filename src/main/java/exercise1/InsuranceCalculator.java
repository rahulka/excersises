package exercise1;

import java.util.Scanner;

public class InsuranceCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = null;
		
		//Accept input
		System.out.println("Please enter number of boxes:");
		input = scanner.next();
		
		System.out.println("Please enter weight of "+ input +" boxes:");
		try{
			Integer numOfBoxes = Integer.parseInt(input);
			float weightOfBox = 0;
			float[] weightsOfBoxes = new float[numOfBoxes];
			
			for (int i=0; i<numOfBoxes ; i++){
				input = scanner.next();
				weightOfBox = Float.parseFloat(input);
				weightsOfBoxes[i] = weightOfBox;
			}
			
			float totalInsurance = calculateInsuranceCost(weightsOfBoxes);
			System.out.println("Total insurance:"+totalInsurance);
			
		}catch(NumberFormatException e){
			System.out.println("Something went wrong with input transformation");
			System.out.println(e);
		}
		scanner.close();
	}

	public static float calculateInsuranceCost(float[] weightsOfBoxes) {
		float maxWeightOfBox = 0, totalInsurance = 0;
		int numOfBoxes = weightsOfBoxes.length;
		for (int i=0; i<numOfBoxes ; i++){
			if (weightsOfBoxes[i] > maxWeightOfBox){
				maxWeightOfBox = weightsOfBoxes[i];
			}
			totalInsurance = totalInsurance + weightsOfBoxes[i] * 2;
		}
		
		totalInsurance = totalInsurance + maxWeightOfBox * 1.5F;
		return totalInsurance;
	}

}
