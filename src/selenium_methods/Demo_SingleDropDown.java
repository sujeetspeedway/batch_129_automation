package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_SingleDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/sample.html");
		
		driver.manage().window().maximize();
		
		WebElement singleSelect=driver.findElement(By.name("city"));

		
		// Create Object of Select Class
		
		Select sc = new Select(singleSelect);
		Thread.sleep(4000);
		sc.selectByIndex(1);
		Thread.sleep(4000);
		sc.selectByValue("3");
		Thread.sleep(4000);
		sc.selectByVisibleText("Delhi");
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
