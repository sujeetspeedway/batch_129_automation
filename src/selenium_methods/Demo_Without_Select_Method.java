package selenium_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Without_Select_Method {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://speedwaytech.co.in/sample.html");

		driver.manage().window().maximize();

		WebElement singleSelect=driver.findElement(By.name("city"));
		
		Select sc = new Select(singleSelect);
		
		List<WebElement> city = sc.getOptions();
		
		for(WebElement e : city) {
			
			if(e.getText().equals("Chennai")) {
				e.click();
				break;
			}
		}
        Thread.sleep(4000);
        driver.close();
	}

}
