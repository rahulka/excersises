package exercise2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharOccurenceTest {

	@Test
	public void testPrintCharOccurenceInTheInputForInput1() {
		assertEquals("A2B3C3D2", CharOccurence.printCharOccurenceInTheInput("AABBBCCCDD"));
	}
	
	@Test
	public void testPrintCharOccurenceInTheInputForInput2() {
		assertEquals("A1B1C3", CharOccurence.printCharOccurenceInTheInput("ABCCC"));
	}

	@Test
	public void testPrintCharOccurenceInTheInputForInput3() {
		assertEquals("A4B1C3D2Z2", CharOccurence.printCharOccurenceInTheInput("ABCCCAAADDZZ"));
	}
	
}
