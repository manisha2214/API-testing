package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNgExp12 {
	WebDriver driver;
	Actions actobj;
  @Test
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    actobj =new Actions(driver);
		actobj.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
  }
  @Test(priority=2,description="This part is for sending the data and click the enter bottom")
  public void SendData() throws InterruptedException
  {
	  WebElement we = driver.findElement(By.name("q"));
	  actobj.sendKeys(we, "macbook").perform();
	  Thread.sleep(2000);
	  actobj.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
  }
  @Test(priority=3,description="This is to close the window")
  public void CloseAUT()
  {
	  driver.close();
  }
}
