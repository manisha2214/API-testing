package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNgExp13 {
	WebDriver driver;
	Actions actobj;
  @Test
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  actobj = new Actions(driver); 
	  
	  }
  @Test(priority = 2,description = "This is a data send method")
  public void senddata() throws InterruptedException
  {
	  WebElement we = driver.findElement(By.id("email"));
	  actobj.sendKeys(we, "manisha2gmail.com").perform();
	  Thread.sleep(2000);
	  WebElement we1 = driver.findElement(By.id("pass"));
	  actobj.sendKeys(we1, "manisha5678").perform();
	  Thread.sleep(2000);
	  actobj.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
  }
 
  
  @Test(priority = 3, description="This is a close method")
  public void closeAUT()
  {
	 driver.close();
  }
}
