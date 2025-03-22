package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Ab_Xpath {

	public static void main(String[] args) {
		// Open Browser
		
		WebDriver driver = new ChromeDriver();
		
		// Open URL
		
		driver.get("https://online.actitime.com/speedwaytech/login.do");
		
		driver.manage().window().maximize();
		
		// Find the WebElement by using Ab Xpath.
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[1]/td/table/tbody/tr[1]/td/input")).sendKeys("speedwaytech74@gmail.com");
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("Sujeet@123");

	}

}
