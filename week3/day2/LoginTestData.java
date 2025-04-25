package week3.day2;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enterusername");
	}
	
	public void enterPassword() {
		System.out.println("Enter the password");
	}

	public static void main(String[] args) {
	
		LoginTestData loginTestData = new LoginTestData();
			 loginTestData.enterCredentials();
			 loginTestData.enterUsername();
			 loginTestData.enterPassword();
			 loginTestData.navigateToHomePage();
		
		
	}

}
