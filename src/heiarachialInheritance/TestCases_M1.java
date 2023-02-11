package heiarachialInheritance;

import org.junit.Test;

public class TestCases_M1 extends ReusableComponents
{
	// **********************Test Cases ***************************
		@Test
		public void composeAndSendAnEmail() // A
		{
			System.out.println("Test Case : ComposeAndSendAnEmail ");
			// launch 5 steps, login 6 steps , compose , send , logout , close
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
			// launch 5 steps , login 6 steps , open , reply , logout , close
			launchApplication();
			loginToApplication();
			open();
			reply();
			logoutFromApplication();
			closeApplication();
		}


}
