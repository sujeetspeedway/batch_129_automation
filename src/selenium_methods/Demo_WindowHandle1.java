package selenium_methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WindowHandle1 {

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
		
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		
		String parentWID = it.next();
		String childWID1= it.next();
		String childWID2= it.next();
		String childWID3= it.next();
		
		System.out.println("Parent window ID : "+parentWID);
		System.out.println("Child Window ID 1 : "+childWID1);
		System.out.println("Child Window ID 2 : "+childWID2);
		System.out.println("Child Window ID 3 : "+childWID3);
	
	}

}
