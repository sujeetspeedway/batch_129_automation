package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_FindElement2 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize();
		
		// 2. FindElement retunrs only single WebElement
		WebElement Ele=driver.findElement(By.xpath("//div[@class='footer content']//a"));
		
		System.out.println(Ele.getText());
		
		Thread.sleep(2000);
		
		// 3. If findElement done not found any Element then it throw exc.
		driver.findElement(By.linkText("Search Trms")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
