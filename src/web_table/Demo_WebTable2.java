package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WebTable2 {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		
		// 1. How any rows in table
		
		int rows=driver.findElements(By.xpath("//table[@id='table1']//tbody/tr")).size();
		System.out.println("Number of rows in table = "+rows);
		
		// 2. How many colums in table
		
		int col=driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th")).size();
		System.out.println("Number of colums in table = "+col);
		
		// 3. first element from table
		String value=driver.findElement(By.xpath("//table[@id='table1']//tr[1]/td[1]")).getText();
		System.out.println("The value is : "+value);
		
		for(int r=1 ; r<=rows;r++)
		{
			String Lname=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+r+"]/td[1]")).getText();
			
			if(Lname.equals("Bach"))
			{
			String Fname=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+r+"]/td[2]")).getText();
			
			String Email=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+r+"]/td[3]")).getText();
			
			System.out.println(Lname+" "+Fname+" "+Email);

			}
					}
	}

}
