package coreConcepts;

import org.junit.Test;

public class LoopingStatements
{
	//if i want to perform the same task for n number of times we go for a FOR loop
	@Test
	public void doRoundsAroundTemple() //10
	{
		System.out.println("Round Number : 1");
		System.out.println("Round Number : 2");
		System.out.println("Round Number : 3");
		System.out.println("Round Number : 4");
		System.out.println("Round Number : 5");
		System.out.println("Round Number : 6");
		System.out.println("Round Number : 7");
		System.out.println("Round Number : 8"); //.....................
		
	}
	
	// counter=1 , till 100  , increment counter   - > Task 
	//for(int intialvalue=1;howlong condition;increment){ true - Task   } 
	@Test
	public void doRoundsAroundTheTemple()
	{
		for(int counter=1;counter<=100;counter = counter+1) // 1<100->t , 2<100->t 98<100->t 99<100->t , 100<=100->t
		{ //true
			System.out.println("Do a Round :" + counter);
		}
	}
	
	//WAP to appy color to steps in building
	@Test
	public void applyColorToSteps_part1() //Definite Loops
	{
		for(int step=1;step<=50;step=step+1) //step = 1  1<50 - > true 49<50
		{ //true
			System.out.println("Apply Color to Step :"+ step);
		}
	}
	
	@Test
	public void applyColorToSteps_part2() //Definite Loops
	{
		for(int step=51;step<=100;step=step+1) //step = 1  1<50 - > true 49<50
		{ //true
			System.out.println("Apply Color to Step :"+ step);
		}
	}
	//WAP to generate Odd Numbers in the range of 1-50
	@Test
	public void applyGreenColorToEven()
	{
		for(int s=2;s<=50;s=s+2)
		{
			System.out.println("Apply Green Color to Step :" + s);
		}
	}
	
	//WAP to generate Even Numbers in the range of 1-50
	@Test
	public void applyRedColorToOdd()
	{
		for(int s=1;s<=50;s=s+2)
		{
			System.out.println("Apply Red Color to Step :" + s);
		}
	}
	@Test
	public void findStudent() //22 66
	{
		boolean flag = false;
		for(int i=1;i<=60;i++)
		{
			//System.out.println("Students Searching :" + i);
			if(i == 36)
			{
				//System.out.println("Found the Student");
				flag = true;
				break;
			}			
		}
		if(flag == true)
		{
			System.out.println("Found the Student");
		}
		else
		{
			System.out.println("Did not Found the Student");
		}
	}
	@Test
	public void findStudent_test()
	{
		boolean result = findStudent(84);
		if(result == true)
		{
			System.out.println("Found the Student");
		}
		else
		{
			System.out.println("Make a call to his parents and inform ");
		}
	}
	
	public boolean findStudent(int stdNum) //22 66  //Indefinite
	{
		boolean flag = false;
		for(int i=1;i<=60;i++)
		{
			//System.out.println("Students Searching :" + i);
			if(i == stdNum)
			{
				//System.out.println("Found the Student");
				flag = true;
				break;
			}			
		}
		return flag;
	}
	
	//Nested Loop
	
	//WAP to apply color to a building with ten floors and each floor having 20 steps
	
	//Loop 1 [outer loop] is responsible for floors - in each floor we will change the color
	 // Loop 2 [Inner loop] is responsible to apply color to individual steps in the floor
	@Test
	public void applyColorToTenFloors()
	{
		for(int floor=1; floor<=10; floor++)
		{
			System.out.println("*************Start applying color to Floor Number :" + floor);
			for(int step=1;step<=20;step++) //Floor = 1 , Step = 1 ........20 , //Floor = 2 , Step = 1 ........20 ,
			{
				System.out.println("Apply Color to Step Number :" + step);
			}
		}
	}
	
	
	
	
	

}
