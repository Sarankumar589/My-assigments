package week3.day2;

public class TestData {

		public void enterCredentials() {
			System.out.println("Enter credentials");
		}
		
		public void navigateToHomePage() {
			System.out.println("Navigate to Homepage");
		}

		public static void main(String[] args) {
			
			TestData data = new TestData();
			data.enterCredentials();
			data.navigateToHomePage();
		
	}

}
