package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_GetTitle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://agilekey.co.in/");
		
		driver.manage().window().maximize();
	
		String getTitle=driver.getTitle();
		
		System.out.println(getTitle);
		
		driver.close();
	}

}
