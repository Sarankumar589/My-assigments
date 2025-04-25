package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Leaftapslogin {

	public static void main(String[] args) {
		
		EdgeDriver driver= new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sarankumar");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anand");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("NewLead");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
	}

}
