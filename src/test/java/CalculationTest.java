package test.java;

import static org.junit.Assert.*;
import main.java.Calculation;

import org.junit.Test;

// Travis CI 確認用
public class CalculationTest {
	
	@Test
	public void testAdd() {
		
		Calculation calculation = new Calculation();
		
		calculation.a = 1;
		calculation.b = 2;
		
		int actual = calculation.add();
		
		int expected = 3;
		
		assertEquals(expected, actual);
	}
}