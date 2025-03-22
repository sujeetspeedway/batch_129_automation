package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Is_Enable {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/PracticeAutomation/");
		
		driver.manage().window().maximize();
		
		WebElement btn =driver.findElement(By.id("but2"));
		
		if(btn.isEnabled()) {
			System.out.println("Test case Pass");
		}
		else {
			System.out.println("Test case Fail");
		}
		
		driver.close();

	}

}
