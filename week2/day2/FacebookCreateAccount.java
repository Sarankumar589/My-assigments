package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {

	public static void main(String[] args) {
		
ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Saran");
        driver.findElement(By.name("lastname")).sendKeys("Anand");
        driver.findElement(By.name("reg_email__")).sendKeys("sarankumar@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("pass123456");

		WebElement drop = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(drop);
		
		s.selectByValue("1");
		
		WebElement monthdrop = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1 = new Select(monthdrop);
		
		s1.selectByVisibleText("Dec");
		
		WebElement yeardrop = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2 = new Select(yeardrop);
		
		s2.selectByValue("1989");
		
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//label[text()='Male']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
