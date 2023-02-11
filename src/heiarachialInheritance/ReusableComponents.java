package heiarachialInheritance;

import org.junit.Test;

public class ReusableComponents {
	//Code Formating : Ctrl + Shift + F
	// **********************Reusable Components****************************
	protected void launchApplication() {
		System.out.println("RC : Launch Application from RC");
		// all steps to launch has to be written here
	}

	void loginToApplication() {
		System.out.println("RC : Login To Application");
	}

	void logoutFromApplication() {
		System.out.println("RC : Logout From Application");
	}

	void closeApplication() {
		System.out.println("RC : Close Application");
	}

	public void compose() {
		System.out.println("RC : Compose Mail");
	}

	public void send() {
		System.out.println("RC : Send Mail");
	}

	void open() {
		System.out.println("RC : Open Mail");
	}

	protected void reply() {
		System.out.println("RC : Reply Mail");
	}

	public void forward() {
		System.out.println("RC : Forward Mail");
	}

	void delete() {
		System.out.println("RC : Delete Mail");
	}
}
