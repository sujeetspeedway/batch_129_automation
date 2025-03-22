package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_KeyBoard4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/sample.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("uname")).sendKeys("Sujeet");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("uname")).sendKeys(Keys.chord(Keys.CONTROL,"z"));
	  

	}

}
