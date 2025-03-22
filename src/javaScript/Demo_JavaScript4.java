package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_JavaScript4 {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		WebElement textBox = driver.findElement(By.name("search"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].value='Iphone'",textBox);
		
		Thread.sleep(2000);
		
		jse.executeScript("document.body.style.zoom = '200%'");
		
		Thread.sleep(2000);
		
		jse.executeScript("document.body.style.zoom = '100%'");
		
		Thread.sleep(2000);
		
		jse.executeScript("document.body.style.zoom = '50%'");
		
		Thread.sleep(2000);
		
		jse.executeScript("document.body.style.zoom = '100%'");
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
