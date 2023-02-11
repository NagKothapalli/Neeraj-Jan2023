package heiarachialInheritance;

import org.junit.Test;

public class TestCases_M2 extends ReusableComponents
{
	@Test
	public void forwardAnEmail() // C
	{
		System.out.println("Test Case : ForwardAnEmail ");
		// launch 5 steps , login 6 steps , compose , reply , logout , close
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}

	@Test
	public void deleteAnEmail() // D
	{
		System.out.println("Test Case : DeleteAnEmail ");
		// launch 5 steps , login 6 steps , compose , reply , logout , close
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}

}
