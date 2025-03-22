package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Navigate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		
		// 1. navigate
		driver.navigate().to("https://agilekey.co.in/");
		
		Thread.sleep(2000);
		
		//2. Back
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		// 3. forward
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		// 4. refresh
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
