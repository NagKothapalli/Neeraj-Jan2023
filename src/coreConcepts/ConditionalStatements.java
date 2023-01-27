package coreConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	int a = 22; //fixed value
	int b = 25; //Assignment operator
	
	
	//WAP to read two integers as input and perform sum of two numbers and return the sum as output
	public void addition_test()
	{
		int output = addition(20,40);
		addition(12,16,18);
	}
	
	
	public void addition(int a,int b,int c)
	{
		int sum = a+b+c; //
	}
	public int addition(int a,int b)
	{
		int sum = a+b; // 
		return sum;
	}
	//if(expression -> boolean : true | false){ true TASK }
	@Test
	public void compareNumbers_if()
	{
		if(a==b) // 22==25 -> false if(false)    22==22 -> true if(true) // == : Relational operator
		{ //true
			//TASK
			int sum = a+b;
			System.out.println("Sum of two numbers :" + sum);
		}
	}
	
	@Test
	public void compareNumbers_ifelse()
	{
		if(a==b) // 22==25 -> false if(false)    22==22 -> true if(true) // == : Relational operator
		{ //true
			//TASK
			int sum = a+b;
			System.out.println("Sum of two numbers :" + sum);
		}
		else
		{ //false
			int diff = a-b;
			System.out.println("Difference of two numbers :" + diff);
		}
	}
	@Test
	public void compareNumbers_ifelse_test() //unit test case
	{
		compareNumbers_ifelse(22,22); //code coverage : 5/10 x100 = 50 %
		compareNumbers_ifelse(42,22);
		compareNumbers_ifelse(-42,-22);
		compareNumbers_ifelse(-42,22);
		compareNumbers_ifelse(42,-22);
	}
	public void compareNumbers_ifelse(int num1,int num2)
	{
		System.out.println("First Number :"+ num1);
		System.out.println("Second Number :"+ num2);
		if(num1==num2) // 22==25 -> false if(false)    22==22 -> true if(true) // == : Relational operator
		{ //true
			//TASK
			int sum = num1+num2;
			System.out.println("Sum of two numbers :" + sum);
		}
		else
		{ //false
			int diff = num1-num2;
			System.out.println("Difference of two numbers :" + diff);
		}
	}
    // code debugging : Process of executing the program line by line by the user .
	//WAP to read two integers as input and perform sum of two numbers if equal , a>b do subtraction , a<b do multiplication
	@Test
	public void demonstrate_elseif_test()
	{
		demonstrate_elseif(22,22);
		demonstrate_elseif(42,22);
		demonstrate_elseif(22,62);
	}
	public void demonstrate_elseif(int a,int b)
	{
		System.out.println("First Number :"+ a);
		System.out.println("Second Number :"+ b);
		if(a==b) 
		{ //true
			//TASK
			int sum = a+b;
			System.out.println("Sum of two numbers :" + sum);
		}
		else if(a>b)
		{ //false
			int diff = a-b;
			System.out.println("Difference of two numbers :" + diff);
		}
		else if(a<b)
		{
			int prod = a*b;
			System.out.println("Product of two numbers:"+prod);
		}
	}
	
	public void thisIsNonStatic()
	{
		System.out.println("This is my Non Static Function");
	}
	public static void thisIsStatic()
	{
		System.out.println("This is my Static Function");
	}
	//switch case , Nested if
	
}

class Consumer
{
	public void demoStaticKeyWord()
	{
		ConditionalStatements.thisIsStatic();//only static members can be accessed thru class name
		ConditionalStatements myObject = new ConditionalStatements();
		myObject.compareNumbers_if();
	}
}













