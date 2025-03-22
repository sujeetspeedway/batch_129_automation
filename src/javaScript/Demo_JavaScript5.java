package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_JavaScript5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement fullName = driver.findElement(By.id("userName"));
		
		jse.executeScript("arguments[0].value='sujeet';",fullName );
		
		WebElement Email = driver.findElement(By.id("userEmail"));
		
		jse.executeScript("arguments[0].value='sujeet@gmail.com';",Email );
		
		WebElement address = driver.findElement(By.id("currentAddress"));
		
		jse.executeScript("arguments[0].value='123 Main Street';",address );
		
		WebElement pAddress = driver.findElement(By.id("permanentAddress"));
		
		jse.executeScript("arguments[0].value='456 Main Street';",pAddress );
		
		WebElement submitBtn = driver.findElement(By.id("submit"));
		jse.executeScript("arguments[0].scrollIntoView(true);",submitBtn );
		
		Thread.sleep(2000);
		
		jse.executeScript("arguments[0].click();", submitBtn );
		
		System.out.println("Form submitted Successfully ! ");

	}

}
