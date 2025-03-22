package robot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Robot {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alert1")).click();
		
		Thread.sleep(2000);
		
		// Take Screen shot using robot class
		
		Robot rb = new Robot();
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect = new Rectangle(dim);
		
		BufferedImage buff=rb.createScreenCapture(rect);
		
		String src = System.getProperty("user.dir")+"//screenshots//homepage.png";
		
		ImageIO.write(buff, "png", new File(src));
		
	  Alert alt = driver.switchTo().alert();

	  alt.accept();
	  
	  driver.close();
	}

}
