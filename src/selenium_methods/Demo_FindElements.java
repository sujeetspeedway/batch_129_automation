package selenium_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_FindElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://magento.softwaretestingboard.com/");

		driver.manage().window().maximize();
        
		// 1. List<WebElement>
		List<WebElement> Ele = driver.findElements(By.xpath("//div[@class='footer content']//a"));

		System.out.println("The size of WebElement is : "+Ele.size());

		// 2. FindElements on Single Element
		List<WebElement> Ele2=driver.findElements(By.linkText("Search Terms"));

		System.out.println("The size of WebElement is : "+Ele2.size());

		// 3. Does not found Element ---> Zero
		List<WebElement> Ele3=driver.findElements(By.linkText("Search Tems"));

		System.out.println("The size of WebElement is : "+Ele3.size());
		
		for(WebElement e : Ele) {
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		
		driver.close();

	}

}
