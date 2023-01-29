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

}
