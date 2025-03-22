package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WebCalendar {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/date-picker");
		
		driver.manage().window().maximize();
		
		WebElement dateInput=driver.findElement(By.id("datePickerMonthYearInput"));
		dateInput.click();
		
		Thread.sleep(4000);
		
		WebElement dateSelected = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--025 ')]"));
		dateSelected.click();
		
		System.out.println("Selected Date : "+dateInput.getAttribute("value"));
		
		driver.close();
				
	}

}
