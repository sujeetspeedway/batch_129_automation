package secreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Screenshot3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
       WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File src=logo.getScreenshotAs(OutputType.FILE);
		
		String trg = ".\\screenshots\\logo.png";
		
		Files.copy(src.toPath(), new File(trg).toPath());
		
		Thread.sleep(3000);
		driver.close();

	}

}
