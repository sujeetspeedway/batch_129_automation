package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_KeyBoard2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		WebElement Fname = driver.findElement(By.id("input-firstname"));
		
		WebElement Lname = driver.findElement(By.id("input-lastname"));
		
		Actions act = new Actions(driver);
		
		Fname.sendKeys("Sujeet");
		
		// CLTR + A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// CLTR + C
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// TAB 
		act.sendKeys(Keys.TAB).perform();
		
		// CLTR + V
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// Validate both the Fname and Lname are same
		if(Fname.getAttribute("value").equals(Lname.getAttribute("value"))) {
			System.out.println("Test case Pass");
		}else {
			System.out.println("Test Case Fail");
		}

	}

}
