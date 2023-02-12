package interfaceConcept;

import org.junit.Test;

public class GeneralStore
{
	//Modifier[opt]  DataType     name  =  value;
	//Modifier[opt]  ClassName    objectName  = new Constructor();
	@Test
	public void customerBill()
	{
		int product1 = 1324233;
		int product2 = 16764543;		
	    MiniCalculator     mCalc    = new MiniCalculator();	    
	    mCalc.welcomeMsg();
	    int bill = mCalc.addition(23434, 657567);
	    System.out.println("Customer Bill :"+ bill);
	}

}
