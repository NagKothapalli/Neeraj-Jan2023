package coreConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	int a = 22; //fixed value
	int b = 25; //Assignment operator
	
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
}
