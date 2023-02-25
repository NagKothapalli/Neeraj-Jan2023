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
	    MiniCalculator     mCalc    = new MiniCalculator(); //X
	    ScientificCalculator sCalc = new ScientificCalculator();
	    //Interface                        Class
	    ArithmeticOperations aCalc = new ScientificCalculator();
	    //WebDriver driver = new WebDriver(); XX
	   //WebDriver driver = new ChromeDriver();
	    mCalc.welcomeMsg();
	    sCalc.welcomeMsg();
	    int bill = sCalc.addition(product1, product2);
	    System.out.println("Customer Bill :"+ bill);
	    aCalc.addition(product1, product2);
	}

}
