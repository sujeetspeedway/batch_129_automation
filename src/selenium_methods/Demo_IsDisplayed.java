package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_IsDisplayed {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		boolean btn=driver.findElement(By.xpath("(//a[@role='button'])[1]")).isDisplayed();
		System.out.println(btn);
		
		boolean btn1=driver.findElement(By.name("btnK")).isDisplayed();
		System.out.println(btn1);
		
		driver.close();

	}

}
