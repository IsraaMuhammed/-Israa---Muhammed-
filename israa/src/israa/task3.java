package israa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task3 extends TestCaseID_1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kcs\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    
		  //Test case ID=1
	      Testcase1(driver);
	     
	      //Test Case ID=2
	      Testcase2(driver);
	     
	     //Test Case ID=3
	       Testcase3(driver);
	     
	     //Test Case ID=4
	      Testcase4(driver);
	    
	     //Test Case ID=5
	      Testcase5(driver);
	     
	     //Test Case ID=6
	     Testcase6(driver);
	     
	     //Test Case ID=7
	     Testcase7(driver);
	     
	     //Test Case ID=8
	     Testcase8(driver);
	     
	    
		    
		    
		    
		}
	
	
	
	}

