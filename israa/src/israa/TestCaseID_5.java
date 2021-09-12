package israa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseID_5 extends TestCaseID_6 {

	public static void Testcase5 ( WebDriver driver ) {
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement searchbox=driver.findElement(By.xpath("//*[@name='q']"));
		//wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(searchbox)));
		boolean flag=true;
		
		searchbox.sendKeys("software testingcoursesoline");
		List <WebElement> listofsearching =new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[contains(@class,'wM6W7d')]"))));
		 
		for(int i=0;i<listofsearching.size();i++) 
		{
			 //System.out.println(listofsearching.size());
		  if(listofsearching.get(i).getText().contains("software") || listofsearching.get(i).getText().matches("softwaretesting"))
		      {
		  System.out.println(listofsearching.get(i).getText());
		  continue; 
		  
		     } 
	    else
	          {
		 flag=false; 
		     } 
		    
	   }
		 
		 if(flag)
		 { System.out.println(" response that fetched for multiple word keyword is correct " +" Status : Pass");
		           
		 }
	else
	{ 
		System.out.println("response that fetched for multiple word keyword isn't correct." +" Status : Fail");
	}
	searchbox.clear();
		  
	}

}
