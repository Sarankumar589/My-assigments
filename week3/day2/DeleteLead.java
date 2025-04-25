package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;




public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();
        
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        driver.get("http://leaftaps.com/opentaps/");
        
       
        driver.findElement(By.id("username")).sendKeys("demosalesmanager"); 
        
        driver.findElement(By.id("password")).sendKeys("crmsfa"); 
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        driver.findElement(By.linkText("Leads")).click();
        
     
        driver.findElement(By.linkText("Find Leads")).click();
        
       
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        
       
        driver.findElement(By.name("phoneNumber")).sendKeys("0123456987");
        
       
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
       
        //driver.quit();
		
		
		
	}

}
