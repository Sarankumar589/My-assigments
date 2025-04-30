package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
public EdgeDriver driver;
	
	@BeforeMethod
	public void preConditions() {
		//Launch the browser
		driver = new EdgeDriver();
		
		//Load the url
		driver.get("https://login.salesforce.com/");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Give user credentials and login
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("testleaf@2024");
		//driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.linkText("Leads")).click();

	}
	
	@AfterMethod
	public void postConditions() {
		driver.close();


	}
	
}
