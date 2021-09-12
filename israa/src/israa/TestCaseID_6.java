package israa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseID_6 extends TestCaseID_7 {

	public static void Testcase6 ( WebDriver driver ) {
		
		WebElement searchbox=driver.findElement(By.xpath("//*[@name='q']"));
		
		WebElement searchbutton=driver.findElement(By.xpath("//*[@class='gNO89b']"));
		 searchbox.sendKeys("java"); 
		 
		List <WebElement> listofsearching =new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[contains(@class,'wM6W7d')]"))));
		
		 for(int i=0;i<listofsearching.size();i++) 
		 {
			 
			 if(listofsearching.get(i).getText().contentEquals("java"))
			 {
				 
			 listofsearching.get(i).sendKeys(Keys.ARROW_DOWN);
			 searchbutton.click();
			 break;
			 
			 }

	}
driver.navigate().back();
driver.navigate().refresh();
	}
	
}
