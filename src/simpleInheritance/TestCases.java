package simpleInheritance;

import org.junit.Test;
//              child            parent
public class TestCases extends ReusableComponents
{
	//**********************Test Cases ***************************
	@Test
	public void composeAndSendAnEmail()  // A
	{
		System.out.println("Test Case : ComposeAndSendAnEmail ");
		//launch 5 steps, login 6 steps , compose , send , logout , close
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void replyToAnEmail() // B
	{
		System.out.println("Test Case : ReplyToAnEmail ");
		//launch 5 steps , login 6 steps , open , reply , logout , close
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void forwardAnEmail() // C
	{
		System.out.println("Test Case : ForwardAnEmail ");
		//launch 5 steps , login 6 steps , compose , reply , logout , close
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
		//launch 5 steps , login 6 steps , compose , reply , logout , close
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}

}
