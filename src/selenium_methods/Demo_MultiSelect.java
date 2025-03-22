package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://speedwaytech.co.in/sample.html");

		driver.manage().window().maximize();
		
		WebElement multiSelect=driver.findElement(By.name("city-multiple"));
		
		Select ms = new Select(multiSelect);
		
		Thread.sleep(4000);
		ms.selectByIndex(1);
		Thread.sleep(4000);
		ms.selectByValue("3");
		Thread.sleep(4000);
		ms.selectByVisibleText("Delhi");
		Thread.sleep(4000);
		ms.deselectAll();
		
		Thread.sleep(4000);
		driver.close();
		

	}

}
