package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_GetTagName {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		// 4. GetTagName----> Valid
		String tagName=driver.findElement(By.name("q")).getTagName();
		
		System.out.println("This is HTML tag of Web Element search Box = "+tagName);
		
		driver.close();
	}
}
