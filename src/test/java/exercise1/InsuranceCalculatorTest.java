package exercise1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercise1.InsuranceCalculator;

public class InsuranceCalculatorTest {

	@Test
	public void testCalculateInsuranceCostForSimpleInput() {
		float[] weightsOfBoxes = new float[] {2, 4, 8, 7};
		
		assertEquals(54f, InsuranceCalculator.calculateInsuranceCost(weightsOfBoxes), 0.0001f);
	}
	
	@Test
	public void testCalculateInsuranceCostForFloatingPointInput() {
		float[] weightsOfBoxes = new float[] {2.1f, 4.2f, 8.9f, 7.2f};
		
		assertEquals(58.15f, InsuranceCalculator.calculateInsuranceCost(weightsOfBoxes), 0.0001f);
	}

}
