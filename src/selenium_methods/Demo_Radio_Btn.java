package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Radio_Btn {

	public static void main(String[] args) throws InterruptedException {
	
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/sample.html");
		
		driver.manage().window().maximize();
		
		boolean radioBtn=driver.findElement(By.id("male")).isSelected();
		System.out.println(radioBtn);
		
		Thread.sleep(3000);
		driver.findElement(By.id("male")).click();
		
		boolean radioBtn1=driver.findElement(By.id("male")).isSelected();
		System.out.println(radioBtn1);
		
		driver.findElement(By.id("male")).click();
		
		Thread.sleep(3000);
		boolean radioBtn2=driver.findElement(By.id("male")).isSelected();
		System.out.println(radioBtn2);
		
		Thread.sleep(3000);
		driver.close();

	}

}
