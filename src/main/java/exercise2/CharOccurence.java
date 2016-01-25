package exercise2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CharOccurence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Accept input
		System.out.println("Please enter string here:");
		String input = scanner.next();
		
		if(input != null && !input.isEmpty()){
			System.out.println("The output will be like:"+ printCharOccurenceInTheInput(input));
		}else{
			System.out.println("Input string not valid! Please enter valid string next time!");
		}
		scanner.close();
	}

	public static String printCharOccurenceInTheInput(String input) {
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
					output.append(c);
					charCount = 1;
				}
			}
		}
		output.append(charCount);
		System.out.println("pre output:"+ output);
		return processOutputToRemoveDuplicates(output.toString());
	}

	private static String processOutputToRemoveDuplicates(String output) {
		StringBuilder finalOutput = new StringBuilder();
		int length = output.length();
		Map<Character, Integer> charToOcurrence = new HashMap<Character, Integer>();
		
		for (int i = 0; i < length; i = i+2) {
			Character curr = output.charAt(i);
			Integer occurence = Character.getNumericValue(output.charAt(i+1));
			if(charToOcurrence.containsKey(curr)){
				Integer newValue = charToOcurrence.get(curr) + occurence;
				charToOcurrence.put(curr, newValue);
			}else{
				charToOcurrence.put(curr, occurence);
			}
		}
		
		System.out.println("Map:"+charToOcurrence.toString());
		
		Set<Entry<Character, Integer>> entrySet = charToOcurrence.entrySet();
		for (Iterator<Entry<Character, Integer>> iterator = entrySet.iterator(); iterator.hasNext();) {
			Entry<Character, Integer> entry = (Entry<Character, Integer>) iterator.next();
			finalOutput.append(entry.getKey());
			finalOutput.append(entry.getValue());
		}
		System.out.println("output:"+finalOutput);
		return finalOutput.toString();
	}

}
