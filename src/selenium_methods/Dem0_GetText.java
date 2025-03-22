package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dem0_GetText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bitrix24.in/");
		
		driver.manage().window().maximize();
		// 3. GetText
		String getText=driver.findElement(By.xpath("//h1[text()='Bitrix24. Your ultimate workspace.']")).getText();
		
		System.out.println(getText);
		
		driver.close();

	}

}
