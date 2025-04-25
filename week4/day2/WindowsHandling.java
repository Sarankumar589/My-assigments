package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		
ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		 
		 Set<String> allWindows = driver.getWindowHandles();
		 System.out.println("All windows address is "+allWindows);
		 
		 List<String> windowsAddress=new ArrayList<>(allWindows);
		 
		 driver.switchTo().window(windowsAddress.get(1));
		 
		 String titleOfChild = driver.getTitle();
		 System.out.println("The title of second page is "+titleOfChild);
		 
		 driver.switchTo().window(windowsAddress.get(0));
		 
		 driver.close();
		 

	}

}
