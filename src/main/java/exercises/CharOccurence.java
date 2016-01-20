package exercises;

import java.util.Scanner;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//Accept input
		System.out.println("Please enter string here:");
		String input = scanner.next();
		
		if(input != null && !input.isEmpty()){
			StringBuilder output = new StringBuilder();
			int length = input.length();
			int charCount = 1;
			
			char c = input.charAt(0);
			output.append(c);
			char nextChar = c ;
			
			for (int i = 1; i < length; i++) {
				nextChar = input.charAt(i);
				if(c == nextChar){
					charCount++;
				}else{
					c = nextChar;
					output.append(charCount);
					if(i+1 < length){
						output.append(input.charAt(i+1));
						charCount = 1;
					}
				}
			}
			output.append(charCount);
			System.out.println("The output will be like:"+ output);
		}else{
			System.out.println("Input string not valid! Please enter valid string next time!");
		}
		scanner.close();
	}

}
