package israa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseID_4 extends TestCaseID_5{
	
	public static void Testcase4 ( WebDriver driver ) {
		WebElement searchbox=driver.findElement(By.xpath("//*[@name='q']"));
		
		searchbox.sendKeys("java"); 
		
		WebElement searchbutton=driver.findElement(By.xpath("//*[@class='gNO89b']"));
		 searchbutton.click();
		 
		 WebElement restime=driver.findElement(By.id("result-stats"));
		 if(restime.isDisplayed()) 
		 {
			  
			 System.out.println("the time taken to get the result is displayed Successfully"+ "Status : Pass");
		 
	    }
		 else
		 {
			 System.out.println("the time taken to get the result not displayed "+ "Status : Fail");
		}
		 
			driver.navigate().back();
			driver.navigate().refresh();
		 }
		

		
}
