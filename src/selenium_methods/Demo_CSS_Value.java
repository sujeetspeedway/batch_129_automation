package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo_CSS_Value {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement searchBtn=driver.findElement(By.name("btnK"));
		
		String btnColor=searchBtn.getCssValue("color");
		System.out.println("Google Search Button color = "+btnColor);
		
		// convert rgb to hex
		
		String Hex = Color.fromString(btnColor).asHex();
		System.out.println("Hex Value of Google Search Btn = "+Hex);
		
		driver.close();

	}

}
