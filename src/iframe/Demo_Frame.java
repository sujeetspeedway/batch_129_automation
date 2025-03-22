package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Frame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		driver.manage().window().maximize();

		driver.switchTo().frame("moneyiframe");

		String nseIndex = driver.findElement(By.id("nseindex")).getText();

		System.out.println("Today's NSE Index Value is : "+nseIndex);
		
		Thread.sleep(2000);
		driver.close();
	}

}
