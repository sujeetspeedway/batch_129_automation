package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_FileUp_FileDown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/upload-and-download/");
		
		driver.manage().window().maximize();
		
		// 1. File Download
		
		driver.findElement(By.xpath("(//a[text()='Download'])[2]")).click();
		
		// 2. File Upload
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("uploadFile")).sendKeys("D:\\Core_java_CertificationUC-265f6e7c-defe-4754-be69-8242b428033e.pdf");

	}

}
