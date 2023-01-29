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
	
	//WAP to read two integers as input and perform the below task if and only if both inputs are above 10 
	//Task : sum of two numbers if equal , a>b do subtraction , a<b do multiplication
	@Test
	public void nestedifCondition_test()
	{
		nestedifCondition(5,8);
		nestedifCondition(55,8);
		nestedifCondition(5,78);
		nestedifCondition(55,55);
		nestedifCondition(55,48);
		nestedifCondition(15,78);
	}
	public void nestedifCondition(int one,int two)
	{
		System.out.println("First Number :"+ one);
		System.out.println("Second Number :"+ two);
		if((one>10) && (two>10)) // Outer if  // T and T -> true  // && - Logical Operator
		{ //true
			//Task
			if(one==two) // Nested if Condition - inner if // == , > , < : Relational Operators
			{ //true
				//TASK
				int sum = one+two; // + , _ , * : Arithmetic Operators
				System.out.println("Sum of two numbers :" + sum);
			}
			else if(one>two)
			{ //false
				int diff = one-two; // = : Assignment Operator
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(one<two)
			{
				int prod = one*two;
				System.out.println("Product of two numbers:"+prod);
			}
		}
		else
		{  //false
		   System.out.println("Both inputs or any one of them might be below 10");
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
	
	//WAP to print the class of the student by taking grade as input
	@Test
	public void printStudentPassedClass_test()
	{
		printStudentPassedClass('A');
		printStudentPassedClass('F');
		printStudentPassedClass('D');
		printStudentPassedClass('G');
		printStudentPassedClass('B');
		printStudentPassedClass('E');
		printStudentPassedClass('C');
		printStudentPassedClass('K');
		printStudentPassedClass('M');
	}
	
	public void printStudentPassedClass(char grade)
	{
		System.out.println("Grade of the student : " + grade);
		switch(grade)
		{
			case 'A' :
			{
				System.out.println("Student passed in First class with Distinction");
				break; // it will take the control out of the switch block
			}
			case 'B' :
			{
				System.out.println("Student passed in First class ");
				break;
			}
			case 'C' :
			{
				System.out.println("Student passed in Second class ");
				break;
			}
			case 'D' :
			{
				System.out.println("Student passed in Third class ");
				break;
			}
			case 'E' :
			{
				System.out.println("Student passed in Ordinary class ");
				break;
			}
			case 'F' :
			{
				System.out.println("Student Failed ");
				break;
			}
			default :
			{
				System.out.println("The given grade is not valid ");
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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













