package config;
import java.util.concurrent.TimeUnit;
import static executionEngine.DriverScript.OR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import utility.Log;
import executionEngine.DriverScript;

public class ActionKeywords {

  	public static WebDriver driver;
  	
  @BeforeClass
   

  @Test
    
  	public static void openBrowser(String object,String data){	
	    System.setProperty("webdriver.gecko.driver","C:/Users/Me/Downloads/geckodriver-v0.20.1-win64/geckodriver.exe");
	    //System.setProperty("webdriver.chrome.driver","C:/Users/Me/Downloads/chromedriver_win32/chromedriver.exe");
	    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	    capabilities.setCapability("marionette", true);
	    	    
		try {
			//If value of the parameter is Mozilla, this will execute
			if(data.equals("Mozilla")){
				driver=new FirefoxDriver();
				Log.info("Mozilla browser started");
				}
			else if(data.equals("IE")){
				//You may need to change the code here to start IE Driver
				driver=new InternetExplorerDriver();
				Log.info("IE browser started");
				}
			else if(data.equals("Chrome")){
				driver=new ChromeDriver();
				Log.info("Chrome browser started");
				}
 
			int implicitWaitTime=(10);
			driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		    //This block will execute only in case of an exception
  			}catch(Exception e){
  				//This is to print the logs - Method Name & Error description/stack
  				Log.info("Not able to open Browser --- " + e.getMessage());
  				//Set the value of result variable to false
  				DriverScript.bResult = false;
  				}
  		}

  	public static void navigate(String object,String data){	
  		try {
  		Log.info("Navigating to URL");
  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		driver.get(Constants.URL);
  		}catch(Exception e){
			Log.info("Not able to navigate --- " + e.getMessage());
			DriverScript.bResult = false;
			}
  		}

  	public static void click(String object,String data){
  		try {
  		Log.info("Clicking on Webelement "+ object);
  		driver.findElement(By.xpath(OR.getProperty(object))).click();
  		}catch(Exception e){
 			Log.error("Not able to click --- " + e.getMessage());
 			DriverScript.bResult = false;
         	}
  		}

  	public static void input(String object,String data){
  		try {
  		Log.info("Entering the text in" + object);
  		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(data); 
  		}catch(Exception e){
			 Log.error("Not able to Enter UserName --- " + e.getMessage());
			 DriverScript.bResult = false;
		 	}
  		}
  	
  	public static void waitFor(String object,String data) throws Exception{
  		try {
  		Log.info("Wait for 5 seconds");
  		Thread.sleep(5000);
  		}catch(Exception e){
			 Log.error("Not able to Wait --- " + e.getMessage());
			 DriverScript.bResult = false;
        	}
  		}
  	 
 
  @AfterClass
    public static void close_Browser(String object,String data){
	    try {
	    Log.info("Closing the browser");
		driver.quit();
	    }catch(Exception e){
			 Log.error("Not able to Close the Browser --- " + e.getMessage());
			 DriverScript.bResult = false;
        	}
	}

}
