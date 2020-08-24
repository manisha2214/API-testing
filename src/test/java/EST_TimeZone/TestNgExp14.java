package EST_TimeZone;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;



public class TestNgExp14 {
	WebDriver driver;
	Actions actobj;
  @Test(priority = 1, description="This is launch method")
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
      actobj = new Actions(driver);
	  actobj.sendKeys(Keys.ESCAPE).perform();
	  Thread.sleep(2000);
	  
  }
  @Test(priority = 2, description="This is send data method")
  public void senddata() throws InterruptedException

  {
	  WebElement we = driver.findElement(By.name("q"));
	  actobj.sendKeys(we,"macbook").perform();
	  Thread.sleep(2000);
	  actobj.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);  	
  }
  @Test(priority = 3, description="This is take the screenshot")
  public void takescreeshot() throws IOException
  {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dest = new File("C:\\Users\\sanip\\Documents\\flipcart.jpg");
	  FileHandler.copy(src, dest);
	  
	  		
	  
  }
  @Test(priority = 4, enabled = false)
  
  public void closeAUT()
  {
	  driver.quit();
  }
  
}
