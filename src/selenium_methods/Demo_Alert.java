package selenium_methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Alert {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(3000); //------> Java Wait
		
		// 1. Simple Alert
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println("Simple Alert Text : "+simpleAlert.getText());
		simpleAlert.accept();
		
		Thread.sleep(2000);
		
		// 2. Conformation Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
	     Alert conformationAlert=driver.switchTo().alert();
	     System.out.println("Conformation Alert Text : "+conformationAlert.getText());
	     conformationAlert.dismiss();
	     
	     Thread.sleep(2000);
	     //3. Promt Alert
	     driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	     Alert promtAlert=driver.switchTo().alert();
	     System.out.println("Promot Alert Text : "+promtAlert.getText());
	     promtAlert.sendKeys("Sujeet");
	     promtAlert.accept();
	     
	     Thread.sleep(3000);
	     driver.close();
	}

}
