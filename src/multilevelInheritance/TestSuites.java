package multilevelInheritance;

import org.junit.Test;
//                 A   extends B  extends C  -> A extends C
//               child             parent            grand parent
public class TestSuites extends TestCases//,ReusableComponents  //      ReusableComponents
{
	/*
	 * public void launchApplication() {
	 * System.out.println("RC : Launch Application from TS"); // all steps to launch
	 * has to be written here }
	 */
	@Test
	public void smokeSuite() //BVT : Build Validation Test
	{
		System.out.println("Test Suite : SMOKE");
		//launchApplication();
		composeAndSendAnEmail();
		replyToAnEmail();
	}
	@Test
	public void regressionSuite() 
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
	}

}
