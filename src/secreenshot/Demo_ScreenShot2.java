package secreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_ScreenShot2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		
		File src=section.getScreenshotAs(OutputType.FILE);
		
		String tar = ".\\screenshots\\product.png";
		
		Files.copy(src.toPath(), new File(tar).toPath());
		
		Thread.sleep(2000);
		driver.close();
	}
}
