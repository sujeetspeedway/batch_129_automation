package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Close_Quit {

	public static void main(String[] args) throws InterruptedException {
		
		// Open Browser
		WebDriver driver = new ChromeDriver();
		
		// Open URL
		driver.get("https://speedwaytech.co.in/testing-02/PracticeAutomation/");
		
		// MAx
		driver.manage().window().maximize();
		
		// WebElement find
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		// Action---> close browser
	    //	driver.close();
		
		Thread.sleep(4000);
		driver.quit();

	}

}
