package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_KeyBoard3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://extendsclass.com/text-compare.html");
		
		driver.manage().window().maximize();
		
		// 1 text box
		WebElement sourceText = driver.findElement(By.xpath("(//div[@class='CodeMirror cm-s-default'])[1]"));
        
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		act.keyDown(sourceText,Keys.CONTROL).sendKeys("a").sendKeys("c").perform();
		
		// 2 text box
		WebElement targetTex = driver.findElement(By.xpath("(//div[@class='CodeMirror-lines'])[2]"));
		
		Thread.sleep(2000);
		
		act.keyDown(targetTex , Keys.CONTROL).sendKeys("a").sendKeys("v").perform();
		
	}

}
