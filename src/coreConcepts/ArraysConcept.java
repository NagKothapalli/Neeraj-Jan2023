package coreConcepts;

import org.junit.Test;

public class ArraysConcept
{
	//public int stdNum1 = 22;
	public int stdNum2 = 24;	
	//Modifier   DataType     name    = value;
	  public        int      stdNumber  = 22;
	//Modifier   DataType[]   name = { values }; // Fixed Array
	  public       int[]     stdNumbers = {24,26,28,23,25,29,31,34,36,38};
	 //Declaration , Assignment , Length , Reading , Writing
	
	@Test
	public void integerFixedArray()
	{    //                 0  1   2  ...........
		int[] stdNumbers = {24,26,28,23,25,29,31,34,36,38};
		int len = stdNumbers.length;
		System.out.println("Length of the array :" + len);
		int std = stdNumbers[0];
		System.out.println("Give chocloate to roll no :" + std);
		for(int i=0;i<len;i++)
		{
			std = stdNumbers[i]; // i=0 1 2 3 4 5
			System.out.println("Give chocloate to roll no :" + std);
		}
	}
}
