package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlingandInteractionAutomation {

	public static void main(String[] args) {
		
	EdgeDriver driver= new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
				
		driver.findElement(By.xpath("//a[img[@src='/images/fieldlookup.gif']]")).click();
		
		Set<String> windowswitched = driver.getWindowHandles();
		
		List<String> window1 = new ArrayList<>(windowswitched);
		
		driver.switchTo().window(window1.get(1));
		
		
		driver.findElement(By.xpath("(//a[@class='linktext' and text()='DemoCustomer'])")).click();
		
		driver.switchTo().window(window1.get(0));
		
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif' and @alt='Lookup']")).click();
		
		Set<String> window2 = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<>(window2);
		
		driver.switchTo().window(windows.get(1));
		
		
		driver.findElement(By.xpath("//a[@class='linktext' and text()='DemoLBCust']")).click();
		
		driver.switchTo().window(windows.get(0));
		
		
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		driver.switchTo().alert().accept();
		
		
		
		System.out.println(driver.getTitle());
		
		

	}

}