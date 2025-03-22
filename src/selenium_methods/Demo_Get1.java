package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Get1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://agilekey.co.in/");
		
	   Thread.sleep(4000);
	   
	   driver.get("https://agilekey.co.in/about-us-3/");
	   
	  String currentURL= driver.getCurrentUrl();
	  System.out.println(currentURL);
	  
	  String expectedURL = "https://agilekey.co.in/about-us-3/";
	  
	  String actualURL = driver.getCurrentUrl();
	  if(expectedURL.equals(actualURL)) {
		  System.out.println("Test Case Pass");
	  }else {
		  System.out.println("Test Case Fail");
	  }
	   driver.close();

	}

}
