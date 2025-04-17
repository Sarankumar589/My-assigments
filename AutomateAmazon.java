package selenium;

import java.time.Duration;
import java.time.temporal.TemporalAmount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAmazon {

	public static void main(String[] args) {
		
ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 
		 WebElement results = driver.findElement(By.xpath("//span[contains(text(),'results')]"));
		 System.out.println("Total results " + results.getText());
		
		 //Brand selection
		 
		 //Brand 1
		 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		 
		 //Brand 2
		 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		 
		 //SortBy selection
		 
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		
		
		//NewArrivals
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		//Print the first resulting bag info
			//Bag Name
		WebElement bagInfo= driver.findElement(By.xpath("//span[text()='Safari']"));
		System.out.println("Bag Name: " + bagInfo.getText());
		
			//Bag Price
		WebElement bagPrice= driver.findElement(By.xpath("//span[text()='2,469']"));
		System.out.println("Discounted Price: Rs " + bagPrice.getText());
		
		//Get the page title and close the browser
		
		System.out.println("Title of the page: "+ driver.getTitle());
		
		driver.close();
	}}
 
