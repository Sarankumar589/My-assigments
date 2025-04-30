package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) {
	
		//Launch the browser
		ChromeDriver driver= new ChromeDriver();
		
		//Load the url
		driver.get("https://www.amazon.in/");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Create actions 
		 Actions act=new Actions(driver);
		 
		 //Search for the product
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		 WebElement submitButton = driver.findElement(By.id("nav-search-submit-button"));
		 act.scrollToElement(submitButton).perform();
		 submitButton.click();
		
		//Price of first product
		 
		 WebElement phonePrice= driver.findElement(By.xpath("//span[text()='299']"));
		 System.out.println("Discounted Price: Rs " + phonePrice.getText());
		
		 //Customer Ratings
		 WebElement phoneReviews= driver.findElement(By.xpath("//span[text()='298']"));
		 System.out.println("Reviews Count is " + phoneReviews.getText());
		 
		 //Click the link of first image
		 WebElement firstProduct= driver.findElement(By.xpath("//span[text()='TheGiftKart Back Cover for OnePlus 9 Pro 5G (TPU, Poly Carbonate | Transparent)']"));
		 act.scrollToElement(firstProduct).perform();
		 firstProduct.click();
		 
		 //Switch windows
		 Set<String> windowHandles = driver.getWindowHandles();
		 
		 List<String> window = new ArrayList<>(windowHandles);
		 
		 driver.switchTo().window(window.get(1));
		 
		 //Click add to basket
		 WebElement addtoBasket= driver.findElement(By.id("add-to-cart-button"));
		 act.scrollToElement(addtoBasket).perform();
		 addtoBasket.click();
		
		//Cart Subtotal
		 WebElement cartSubtotal= driver.findElement(By.xpath("//span[text()='₹299.00']"));
		 
		 String cartSubtotalText = cartSubtotal.getText(); 
		 System.out.println("Cart Subtotal: " + cartSubtotalText);

		 String expectedSubtotal = "₹299.00"; // Update this value as per actual price
		 if (cartSubtotalText.contains(expectedSubtotal)) {
		     System.out.println("Subtotal verification PASSED.");
		 } else {
		     System.out.println("Subtotal verification FAILED.");
		 }

		 // Close the browser
		 //driver.quit();
		 
		 
	}

}
