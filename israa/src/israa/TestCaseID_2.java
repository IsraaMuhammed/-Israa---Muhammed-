package israa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseID_2 extends TestCaseID_3 {

		public static void Testcase2 ( WebDriver driver ) {
			
		WebElement searchbox=driver.findElement(By.xpath("//*[@name='q']"));
		
		searchbox.sendKeys("java");  
		
		boolean flag=true;
		
		List <WebElement> listofsearching =new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[contains(@class,'wM6W7d')]"))));
		System.out.println(driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[contains(@class,'wM6W7d')]")).size());
		
			for(int i=0;i<listofsearching.size();i++)
			{
				 if(listofsearching.get(i).getText().contains("java")) 
				 {
					 //System.out.println(listofsearching.get(i).getText());
					 continue;
				 }
				 
				 else
				 {
				 	 flag=false;
				    }
			}
			
			if(flag)
			{
				System.out.println("all response fetched for a search keyword correct and related to it." +" Status : Pass");
			}
			
			else
			{
				System.out.println("all response fetched for a search keyword not correct and not related to it." +" Status : Fail");
            }
			
			searchbox.clear();
	}

}
