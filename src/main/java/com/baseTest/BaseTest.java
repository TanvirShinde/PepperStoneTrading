package com.baseTest;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Pages.LoginPage;
import com.utility.PropertiesFileUse;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver ;
	
     String browser ="Chrome";
	
    public LoginPage lp27;
	

	
	
	  @BeforeMethod
	   public void openBrowser () throws IOException, InterruptedException {
		   
		   if (browser.equalsIgnoreCase("Chrome")) 
		   {
			   WebDriverManager.chromedriver().setup();
			   
			   driver = new ChromeDriver();
			   
		   }
		   
		   else if (browser.equalsIgnoreCase("firefox")) {
			   
			   WebDriverManager.firefoxdriver().setup();
			   
			   driver = new FirefoxDriver();
		   }
		   
          else if (browser.equalsIgnoreCase("Edge")) {
			   
			   WebDriverManager.edgedriver().setup();
			   
			   driver = new EdgeDriver();
		   }
		   
          else {
        	  
        	  System.out.println("Choose Correct browser");
          }
		   
		   
		   driver.manage().window().maximize();
		   
		   driver.get(PropertiesFileUse.propertiesData("url"));
		   
		   driver.manage().timeouts().implicitlyWait(50 , TimeUnit.SECONDS);
		   
		  // driver.get("https://auth.pepperstone.com/login");
     
		    driver.manage().deleteAllCookies();
		    
               lp27 = new LoginPage () ;
		    
			 
		   
		   }

	
          @AfterMethod    
	      public void tearDown () throws InterruptedException {
	    	  
	    	  Thread.sleep(4000);
	    	  
	    	 // driver.quit();
	      }
          
        
}
