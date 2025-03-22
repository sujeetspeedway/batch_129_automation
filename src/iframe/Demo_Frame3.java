package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Frame3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/Frames/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1"); // -----> First frame or  Parent Frame
		driver.switchTo().frame("frame3"); //-----> Second frame or Child Frame
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.tagName("input")).sendKeys("Sujeet");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement dd = driver.findElement(By.id("animals"));
		
		Select dropdown = new Select(dd);
		
		Thread.sleep(3000);
		dropdown.selectByVisibleText("Avatar");
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
