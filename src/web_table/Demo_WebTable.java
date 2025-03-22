package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WebTable {

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
		
		String value=driver.findElement(By.xpath("//table[@id='table1']//tr[1]/td[1]")).getText();
		System.out.println("The value is : "+value);
		
		System.out.println(" Below is Data from table");
		
		for(int r=1 ; r<=rows ; r++) {
			
		for(int c=1 ; c<=col ; c++) {
			
		
String tableData=driver.findElement(By.xpath("//table[@id='table1']//tr["+r+"]/td["+c+"]")).getText();
		
		System.out.print(tableData+ "  ");
		}
		System.out.println();
		}
		driver.close();

	}

}
