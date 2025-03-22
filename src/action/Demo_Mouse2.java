package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Mouse2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/Drag-n-Drop/");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.id("box3"));
		
		WebElement target = driver.findElement(By.id("box103"));
		
		WebElement source1 = driver.findElement(By.id("box1"));
		
		WebElement target1 = driver.findElement(By.id("box101"));
		
		Actions act = new Actions(driver);
		

		act.dragAndDrop(source, target).perform();
		
		act.dragAndDrop(source1, target1).perform();

	}

}
