package selenium_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/PracticeAutomation/");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.className("dropbtn")).click();
		
		//Thread.sleep(3000);
	   //driver.findElement(By.linkText("Facebook")).click();
		
		WebElement face = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		
		face.click();
		

	}

}
