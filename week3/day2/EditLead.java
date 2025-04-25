package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

EdgeDriver driver= new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf Company");
        
        
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Saran");
        
      
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Anand");
        
     
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("SKA");
        
        
        driver.findElement(By.name("departmentName")).sendKeys("Sales Department");
        
      
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Description for the new lead.");
        
       
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sk.a@email.com");
        
      
        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select stateSelect = new Select(state);
        stateSelect.selectByVisibleText("New York");
        
        
        driver.findElement(By.name("submitButton")).click();
        
        
        driver.findElement(By.linkText("Edit")).click();
        
        
        driver.findElement(By.id("updateLeadForm_description")).clear();
        
       
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important note for lead.");
        
        
        driver.findElement(By.name("submitButton")).click();
        
      
        String pageTitle = driver.getTitle();
        System.out.println("Title of the page: " + pageTitle);
        
      
        //driver.quit();
		
		
		
		
		
	}

}
