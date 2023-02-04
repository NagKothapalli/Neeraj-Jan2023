package coreConcepts;

import org.junit.Test;

public class StringOperations
{
	String a = "     Selenium With Java          ";
	
	@Test
	public void basicOperations()
	{
		int len = a.length();
		System.out.println("String length :" + len);
		String aT = a.trim();
		System.out.println("String length after trim :" + aT.length());
		String aL = a.trim().toLowerCase();
		System.out.println("String after Lower :" + aL);
		String aU = a.trim().toUpperCase();
		System.out.println("String after Upper :" + aU);
	}
	//Exceptions : 
	//java.lang.StringIndexOutOfBoundsException: String index out of range: 23
	//java.lang.ArithmeticException: / by zero
	@Test
	public void subStringOperation()
	{
		String a8 = a.trim().substring(8);
		System.out.println("String from 8th char :" + a8);
		String a08 = a.trim().substring(0, 8);
		System.out.println("String from 0-8th :" + a08);
		//String a823 = a.trim().substring(8, 23);
		//System.out.println("String from 8-22nd :" + a823);
		//Exceptions in java : Checked[Compile Time]  / UnChecked[Run Time]
		int b = 24/0;
	}
	@Test
	public void stringContainsOperation()
	{
		String a = "     Selenium With Java          ";
		String b = "JAVA";
		//if(a.trim().contains(b.trim()))
		a = a.trim().toLowerCase();
		b = b.trim().toLowerCase();
		//if(a.contains(b))	
		if(a.trim().toUpperCase().contains(b.trim().toUpperCase())){//true
			System.out.println("A contains B");
		}
		else{ //false
			System.out.println("String B is not in string A");
		}
	}
	@Test
	public void stringEqualsOperation()
	{
		String a = "     Selenium With Java                 ";
		String b = "        Selenium With JAVA          ";
		//Both of them must be of type strings , same in length , same in case , same in character sequence
	    //if(a.trim().equals(b.trim()))
		//if(a.trim().toLowerCase().equals(b.trim().toLowerCase()))
		//if(a.trim().toUpperCase().equals(b.trim().toUpperCase()))
		if(a.trim().equalsIgnoreCase(b.trim()))
	    {
	    	System.out.println("Both strings are equal");
	    }
	    else
	    {
	    	System.out.println("Both strings are not equal");
	    }
	
	}
	@Test
	public void characterAtOperation()
	{
		String a = "     Selenium With Java                 ";
		char c0 = a.trim().charAt(0);
		System.out.println(" char at 0th :" + c0);
		//char c34 = a.trim().charAt(34);
		//System.out.println(" char at 34th :" + c34);
		// find n
		boolean answer = false;
		for(int index=0;index<a.trim().length();index++)
		{
			a = a.trim();
			if(a.charAt(index) == 'n')
			{ //if there is a match found
				answer = true;
			}
		}
		if(answer == true)
		{
			System.out.println("Charcter found");
		}
		else
		{
			System.out.println("Character not found");
		}
	}
	@Test
	public void characterCount() // mychar = e
	{
		char mychar = 'A';
		String a = "     Selenium Automation With Java  AAA               ";
		a = a.trim();
		int counter =0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i) == 'A' || a.charAt(i) == 'a')
			{
				counter = counter + 1;
			}
		}
		
		System.out.println("Count of given char :" + counter);
	}
	@Test
	public void replaceOperation()
	{
		String a = "     Selenium Automation With Java  AAA  Java     is my Java Core area             ";
		
		String aR = a.replace('e', 'E');
		System.out.println(a);
		System.out.println(aR);
		
		String aRR = a.replace("Java", "Csharp");
		System.out.println(aRR);
		String aspace = a.replace("Java", "");
		System.out.println(aspace);
		
	}
	
	//Split
	
	
	

}
