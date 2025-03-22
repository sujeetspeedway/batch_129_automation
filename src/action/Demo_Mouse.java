package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Mouse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/buttons/");
		
		driver.manage().window().maximize();
		
		
		// 1. Simple Click
		driver.findElement(By.id("pD03d")).click();
		
		Thread.sleep(3000);
		// 2. Right Click
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		
		// 3. Double Click
		WebElement doubleClik = driver.findElement(By.id("doubleClickBtn"));
		
		// Object of Action class
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClick).perform();
		
		act.doubleClick(doubleClik).perform();
		
		

	}

}
