package israa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseID_8 {

	public static void Testcase8 ( WebDriver driver ) {
		
		
		WebElement searchbox=driver.findElement(By.xpath("//*[@name='q']"));
		searchbox.sendKeys("software tes"); 
		
		boolean flag=false;
		
		List <WebElement> listofsearching =new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[contains(@class,'wM6W7d')]"))));
		for(int i=0;i<listofsearching.size();i++)
		{     
			
			 if(listofsearching.get(i).getText().equals("software testing") ) 
			 {
				 System.out.println(listofsearching.get(i).getText());
				 listofsearching.get(i).click();
				 flag=true;
				 break;
				 
			 }
			
		}
		
		if(flag) {
			System.out.println("auto-suggestion in Google is work and give the suggestion keyword " +" Status : Pass");
			driver.navigate().back();
			driver.navigate().refresh();
			
		}
		
		else {	
			System.out.println("auto-suggestion in Google not work " +" Status : Fail");
             }
	

}
}
