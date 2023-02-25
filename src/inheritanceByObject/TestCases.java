package inheritanceByObject;

import org.junit.Test;
//              child            parent
public class TestCases //extends ReusableComponents
{
	//Modifier  ClassName  objectName  = new Constructor();
	//public ReusableComponents  rc = new ReusableComponents();
	public ReusableComponents  rc = new ReusableComponents("firefox");
	int num = 22;
	/*
	 * public void launchApplication() {
	 * System.out.println("RC : Launch Application from TC"); //all steps to launch
	 * has to be written here }
	 */
	//ExecutionFlow : Instance variables  -> Constructor  -> Test Method
	//**********************Test Cases ***************************
	@Test
	public void composeAndSendAnEmail()  // A
	{
		System.out.println("Test Case : ComposeAndSendAnEmail ");
		//launch 5 steps, login 6 steps , compose , send , logout , close
		rc.launchApplication();
		rc.loginToApplication();
		rc.compose();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void replyToAnEmail() // B
	{
		System.out.println("Test Case : ReplyToAnEmail ");
		//launch 5 steps , login 6 steps , open , reply , logout , close
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void forwardAnEmail() // C
	{
		System.out.println("Test Case : ForwardAnEmail ");
		//launch 5 steps , login 6 steps , compose , reply , logout , close
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void deleteAnEmail() // D
	{
		System.out.println("Test Case : DeleteAnEmail ");
		//launch 5 steps , login 6 steps , compose , reply , logout , close
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}

}
