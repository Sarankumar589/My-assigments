package week2.day1;


public class Browser {
	
	public String launchBrowser(String browserName) {  
		System.out.println(browserName);
		return browserName;
	}
public void loadUrl() {
	System.out.println("application url loaded sucessfully");
}
	public static void main(String[] args) {
	
Browser chrome = new Browser();
	chrome.launchBrowser("Browser launched sucessfully");
	chrome.loadUrl();
	}

}
