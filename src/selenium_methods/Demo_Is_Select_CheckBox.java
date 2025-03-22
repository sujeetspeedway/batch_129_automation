package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Is_Select_CheckBox {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/sample.html");
		
		driver.manage().window().maximize();
		
		boolean checkBox=driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkBox); // ---> f
		
		Thread.sleep(3000);
		driver.findElement(By.id("rep")).click();
		
		boolean checkBox1=driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkBox1); //----->t
		
		Thread.sleep(3000);
		driver.findElement(By.id("rep")).click();
		
		Thread.sleep(3000);
		boolean checkBox2=driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkBox2); //--->f

		Thread.sleep(3000);
		driver.close();
	}

}
