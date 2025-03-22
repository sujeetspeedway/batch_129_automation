package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Locators {

	public static void main(String[] args) throws InterruptedException {
	 
		// Open Browser
		// WebDriver-----> Interface
		// ChromeDriver----> Class
		
		WebDriver driver = new ChromeDriver();
		
		// Open URL ----> Method Get
		
		driver.get("https://online.actitime.com/speedwaytech/login.do");
		
		driver.manage().window().maximize();
		
		// 1. ID Locator
		
		driver.findElement(By.id("username")).sendKeys("speedwaytech74@gmail.com");
		
		// 2. Name Locator
	    
		driver.findElement(By.name("pwd")).sendKeys("Sujeet@123");
		
		// 3. Link Text Locator
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// 4. Partial Link Text Locator
		
	    Thread.sleep(3000);
	    driver.findElement(By.partialLinkText("Return")).click();
		
	    // Enter UN and PW
	    driver.findElement(By.id("username")).sendKeys("speedwaytech74@gmail.com");
	    
	    driver.findElement(By.name("pwd")).sendKeys("Sujeet@123");
	    
	    // 5. Tag Name Locator
	    driver.findElement(By.tagName("a")).click();
	    
	    Thread.sleep(4000);
	    // 6. Class Name Locator
	    driver.findElement(By.className("logout")).click();
	    
	    Thread.sleep(4000);

	    driver.close();
	}

}
