package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Ajio {

	public static void main(String[] args) {
		
EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.findElement(By.name("searchVal")).sendKeys("bags");
        
		driver.findElement(By.className("ic-search")).click();
		
		
		
		
		
	}

}
