package coreConcepts;

import org.junit.Test;

public class CalculatorWithJunit
{
	@Test //Annotation //  Junit will treat this java method with @Test label as a Test Method that needs to be executed
	public void addition_test()
	{
		System.out.println("This is my Addition");
		//call the dev code
	}
	@Test
	public void subtraction_test()
	{
		System.out.println("This is my Subtraction");
	}
	@Test
	public void multiplication_test()
	{
		System.out.println("This is my Multiplication");
	}
	@Test
	public void division_test()
	{
		System.out.println("This is my Division");
	}
	
	//Java Developers will write the Development code in a different class and they will write unit test cases for that code 
	// in a test class  and they will call Dev functions from the Junit test methods 

}
