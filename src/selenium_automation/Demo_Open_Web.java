package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Open_Web {

	public static void main(String[] args) {
	
		// Open Web Page
		// WebDriver------> Interface
		// ChromeDriver-----> Class
		// driver----> refe--->var.
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		
	}

}
