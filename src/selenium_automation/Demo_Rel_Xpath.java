package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Rel_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		// Open Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.actitime.com/speedwaytech/login.do");
		
		driver.manage().window().maximize();
		
		// Relative Xpath
		// 1. Attribute
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedwaytech74@gmail.com");
		
		// 2. contains Attribute
		
		driver.findElement(By.xpath("//input[contains(@class,'pwdfield')]")).sendKeys("Sujeet@123");
		
		// 3. Text()
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		
		// 4. contains Text()
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Return')]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedwaytech74@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@class,'pwdfield')]")).sendKeys("Sujeet@123");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
		
		Thread.sleep(4000);
		
		driver.close();
		
		

	}

}
