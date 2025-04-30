package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser

		ChromeDriver driver= new ChromeDriver();
		
		//Load the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Accept cookies if present
         try {
             WebElement acceptCookies = driver.findElement(By.id("accept-choices"));
             acceptCookies.click();
         } 
         catch (Exception e) {
             System.out.println("Cookies popup not found or already accepted.");
         }	 
		 
		//Transfer the focus to frame
			driver.switchTo().frame("iframeResult");
		
		//Click the TryIt button
			driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		// Switch to alert
			Alert simpleAlert = driver.switchTo().alert();
		
		// Choose to accept the alert
			simpleAlert.accept();
			
		// Get the result text
			WebElement resultText = driver.findElement(By.id("demo"));
			
			String actualText = resultText.getText();

	   // Verify the result
	        if (actualText.equals("You pressed OK!")) {
	            System.out.println("Test was Passed: OK was pressed.");
	            
	        } else if (actualText.equals("You pressed Cancel!")) {
	            System.out.println("Test Passed: Cancel was pressed.");
	            
	        } 
			
			
	}

}
