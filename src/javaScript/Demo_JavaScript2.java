package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_JavaScript2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		
		Thread.sleep(2000);
		
		// 1. Navigate method
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		//  2. Action class
		Actions act = new Actions(driver);
		act.sendKeys(Keys.F5).perform();
		
		Thread.sleep(2000);
		// 3. JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.location.reload();");
		
		Thread.sleep(2000);
		// 4. getCurrent URL
		driver.get(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		// 5. navigate
		driver.navigate().to(driver.getCurrentUrl());

	}

}
