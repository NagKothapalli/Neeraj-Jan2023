package coreConcepts;

import org.junit.Test;

public class GmailAutomation
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
	
	//**********************Reusable Components****************************
	private void launchApplication()
	{
		System.out.println("RC : Launch Application");
		//all steps to launch has to be written here
	}
	private void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
    public void compose()
    {
    	System.out.println("RC : Compose Mail");
    }
    public void send()
    {
    	System.out.println("RC : Send Mail");
    }
    private void open()
    {
    	System.out.println("RC : Open Mail");
    }
    protected void reply()
    {
    	System.out.println("RC : Reply Mail");
    }
    public void forward()
    {
    	System.out.println("RC : Forward Mail");
    }
    void delete()
    {
    	System.out.println("RC : Delete Mail");
    }
}
