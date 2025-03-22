package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_FindElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		// Return type of FindElement----> WebElement
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("Selenium WebDriver");
		
		Thread.sleep(2000);
		searchBox.submit();
		
		Thread.sleep(2000); //-------> Java Wait
		
		System.out.println("Page Title = "+driver.getTitle());

		driver.close();

	}

}
