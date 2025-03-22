package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WindowHandle {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/PracticeAutomation/");
		
		driver.manage().window().maximize();
		
		// 1. GetWindowHandle()
		
		String windowID=driver.getWindowHandle();
		System.out.println(windowID);   // C0D7FE19D746859DCBA5CA57B883D110
		                                // 7D06DD988B2F98114798F0F31E3BE383
		driver.close();
		

	}

}
