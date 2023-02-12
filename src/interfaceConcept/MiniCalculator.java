package interfaceConcept;

//class can inherit another class ->   ClassA extends ClassB
//class can inherit an interface  -> ClassA implements InterfaceB
public class MiniCalculator implements ArithmeticOperations
{
	public void welcomeMsg()
	{
		System.out.println("Welcome to Casio Mini");
	}
	
	public int addition(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	public int subtraction(int a,int b)
	{
		int sum = a-b;
		return sum;
	}
	public int multiplication(int a,int b)
	{
		int sum = a*b;
		return sum;
	}
	public int division(int a,int b)
	{
		int sum = a/b;
		return sum;
	}
	

}
