package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Frame2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing/frames/frames.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//1. Handle Frame by using Index
		driver.switchTo().frame(1);
		driver.findElement(By.name("name1")).sendKeys("Sujeet");
		
		
		// 3. Handle frame by using parentFrame
		driver.switchTo().parentFrame();
		//2. Handle Frame by using WebElement
		WebElement frame = driver.findElement(By.xpath("//frame[@src='frame3.html']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.name("check")).click();
		
		// 4. default content
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		driver.findElement(By.name("rep")).click();

		Thread.sleep(3000);
		driver.close();
	}

}
