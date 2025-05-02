package week5.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch the browser

			ChromeDriver driver= new ChromeDriver();
				
		//Load the url
			driver.get("https://erail.in/");
				
		//Maximize the Browser
			driver.manage().window().maximize();
				
		//Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		// Accept cookies if present
	         try {
	             WebElement acceptCookies = driver.findElement(By.xpath("//p[@class='fc-button-label' and text()='Consent']"));
	             acceptCookies.click();
	         } 
	         catch (Exception e) {
	             System.out.println("already accepted.");
	         }	 
				
	    //Enter "MAS" as the "From" station
	         WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
	         fromStation.clear();
	         fromStation.sendKeys("MAS");
	         fromStation.sendKeys(Keys.ENTER);
	         
	   //Enter "MDU" as the "To" station.
	         WebElement toStation = driver.findElement(By.id("txtStationTo"));
	         toStation.clear();
	         toStation.sendKeys("MDU");
	         toStation.sendKeys(Keys.ENTER);
	         
	  //Uncheck the "Sort on Date" checkbox
	         WebElement sortUncheck = driver.findElement(By.id("chkSelectDateOnly"));
	         sortUncheck.click();
	         
	  //Retrieve the train names from the web table.
	         
	         List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
	         System.out.println("Trains Found: " + trainNames.size());
			
	 // Stored train names in a Set to check for any duplicates
	         Set<String> trains = new HashSet<>();

	         System.out.println("Train Names:");
	         for (WebElement train : trainNames) {
	             String trainList = train.getText();
	             System.out.println(trainList);
	             trains.add(trainList);
	         }

	// Compare to detect duplicates
	         System.out.println("Total trains: " + trainNames.size());
	         System.out.println("Unique trains: " + trains.size());

	         if (trains.size() == trainNames.size()) {
	             System.out.println("No duplicate train names.");
	         } else {
	             System.out.println("Duplicate train names found.");
	         }

	         // Close browser
	         //driver.quit();
	         
	         
	}

}
