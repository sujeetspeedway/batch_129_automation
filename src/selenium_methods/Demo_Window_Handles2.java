package selenium_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Window_Handles2 {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/PracticeAutomation/");
		
		driver.manage().window().maximize();
		
		// Parent Window
		driver.findElement(By.xpath("//a[text()='Browser Windows']")).click();
		
		
		Thread.sleep(2000);
		// Child Window -1
		driver.findElement(By.id("tabButton")).click();
		
		Thread.sleep(2000);
		// Child Window -2
		driver.findElement(By.id("windowButton")).click();
		
		Thread.sleep(2000);
		// Child Window - 3
		driver.findElement(By.id("messageWindowButton")).click();
		
		// Set is a collection in java
		Set<String> windowIDs=driver.getWindowHandles();
		
		// Convert set into List
		
		List<String> windowIDlist = new ArrayList(windowIDs);
		
		String ParentWID=windowIDlist.get(0);
		
		String ChildWID1=windowIDlist.get(1);
		
		String ChildWID2=windowIDlist.get(2);
		
		System.out.println("Parent Window ID : "+ParentWID);
		System.out.println("Child Window ID 1 : "+ChildWID1);
		System.out.println("Child Window ID 2 : "+ChildWID2);
		
		// How to Use window ID for Switching
		
		driver.switchTo().window(ParentWID);
		
		System.out.println("Parent Window Title : "+driver.getTitle());
		
		driver.switchTo().window(ChildWID1);
		System.out.println("Child Window Titile : "+driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
