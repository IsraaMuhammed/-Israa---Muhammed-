package israa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseID_7 extends TestCaseID_8 {

public static void Testcase7 ( WebDriver driver ) {
	//WebDriverWait wait = new WebDriverWait(driver,10);
	
	WebElement searchbox=driver.findElement(By.xpath("//*[@name='q']"));
	    //wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(searchbox)));
	
	    searchbox.sendKeys("java"); 
	    searchbox.sendKeys(Keys.ENTER);
	    
	driver.navigate().back();	
    driver.navigate().refresh(); 
		 

	}

}
