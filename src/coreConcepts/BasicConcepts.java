package coreConcepts;

//Signature | Syntax : CLASS
  //Modifier  class  Name{   Members  }
  //Modifiers : Access - private , default , public/protected
  //            Non-Access : static , final
//Naming Convention : Class name should start with UpperCase letter , No Space in class name ,
   // No special characters are allowed , Don't start with Numeric
public class BasicConcepts
{
	//Members : variables | Functions
	//Signature : VARIABLE
	     //Modifier[opt]   DataType  Name; - Declaration
		 //Modifier[opt]   DataType  Name = value; - Assignment
	public static String collegeName = "JNTU";
	public static int  intrestRate = 2;
	public static int bankCode = 2222;
	public static int zipCode = 23454;
	private char stdGrade = 'A';
	              boolean stdResult = true;
	              double stdMarks = bankCode; //up casting
	 //integer - byte-10 kg , short - 20 kg   ,int   - 40 kg , long - 80 kg
	              byte bag1 = 99;
	              short bag2 = 9999;
	              int bag3 = 999999999;
	              long bag4 = 765545355;
	 //Type Casting : Converting one data type to another type 
	            short  bag5 = bag1 ; //implicit type casting , up casting , widening
	            //byte bag6 = bag3;
	//Signature : Method | Function
	      //Modifier[opt]   ReturnType  Name(){  body- definition , implementation }
	            
	     //Modifier[opt]   ReturnType  Name(arguments...[opt]){  body- definition , implementation }
	                                      //DataType arg1,DataType arg2
	    //There is only one gate to my house      
	    public static void openDoor()
	    {
	    	System.out.println("Open the Main Gate");
	    }
	    //Assembly building having multiple gates
	    public static void openDoor(int gateNumber)
	    {
	    	System.out.println("Open the Gate : + gateNumber" );
	    	System.out.println("Open the Gate :"+ gateNumber);
	    }
	    
	  //Naming Conventions : Member of a class - variable / Function|Method
	    
	    //It can start with an _ , $ , a-z , A-Z
	    //should not have any spaces with in the name
	    //No special characters are allowed
	    //It should follow camelCasing [only Constructor of a class need not follow camelCasing rule]
	    
	    //Valid Cases
	    int _empNum;int emp_Num; int emp_Num_;  int $empNum; int emp$Num; int empNum$; int $emp_Num;
	    
	    int empNum; int EmpNum;  int emp1Num; int empNum1;
	    
	    //InValid Cases
	    //int emp&Num;//int emp Num; //int 1empNum;//int @empNum; //int -empNum;
	    
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            

}
