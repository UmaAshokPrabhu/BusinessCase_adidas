package utils;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;
 
    
    private static WebDriver driver;
    
    
    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 90;
    public final static int PAGE_LOAD_TIMEOUT = 80;

    public  SeleniumDriver() {

    	//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Eclipse\\driver\\chromedriver.exe");
    	
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\runner\\chromedriver.exe");
    	driver = new ChromeDriver();
        driver.manage().window().maximize();      
        
        
        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        
       
    }

    public static void openPage(String url) throws InterruptedException {
    	System.out.println(url);
    	
        driver.get(url);
        
        
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
       if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver();
      
    }

    public static void tearDown() throws InterruptedException {
        if (driver != null) {
        	
        	
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }
    
    public static void waitForPageToLoad()
    {
    	try {
    		 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
