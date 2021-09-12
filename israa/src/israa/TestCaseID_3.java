package israa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseID_3 extends TestCaseID_4 {


		public static void Testcase3 ( WebDriver driver ) {
		WebElement searchbox=driver.findElement(By.xpath("//*[@name='q']"));
		searchbox.sendKeys("java"); 
		
		List <WebElement> listofsearching =new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[contains(@class,'wM6W7d')]"))));
		int countitems=listofsearching.size(); if(countitems >10) 
		{
		System.out.println("total count of suggestions > 10 "+" Status : Fail"); 
		}
		 else 
		 {  System.out.println("total count of suggestions not greater than 10 "+" Status : Pass"); 
		 }
		
   searchbox.clear();
   
	}

}
