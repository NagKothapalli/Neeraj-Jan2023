package coreConcepts;

import org.junit.Test;

public class CalculatorWithDevCode
{
	
	@Test
	public void addition() // Dev code
	{
		int sum = 42+44; //Hard coded value
		System.out.println("Sum of two numbers :" + sum);
	}
	
	
	//********************Test Cases ******************************
	@Test
	public void addition_test() //White / Glass box testing 
	{
		addition(2,4); //Test Case 1
		addition(22,44);  //Test Case 2
		addition(242,484);  //Test Case 3
		addition(2222,1144);  //Test Case 4
	}
	
	
	//********************Dev code ********************************
	public void addition(int a,int b) // Dev code
	{
		int sum = a+b;
		System.out.println("Sum of two numbers :" + sum);
	}
	

}
