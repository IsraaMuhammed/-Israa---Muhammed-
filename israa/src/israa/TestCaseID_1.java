package israa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCaseID_1 extends TestCaseID_2 {
	
	public static void Testcase1 ( WebDriver driver ) {
		
	WebElement searchbox=driver.findElement(By.xpath("//*[@name='q']"));
	
	if(searchbox !=null) 
	{
		System.out.println("Search Testbox is present , Status: Pass");	
	}
	
	else{
		System.out.println("Search Testbox is not present , Status: Fail");
	  }
	
	}

}
