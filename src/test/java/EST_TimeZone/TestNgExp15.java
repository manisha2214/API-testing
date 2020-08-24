package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExp15 {
	WebDriver driver;
	JavascriptExecutor jse;
  @Test(priority=1)
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://login.salesforce.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  
  }
  @Test(priority=2)
  public void SendData() throws InterruptedException
  {
	  jse = (JavascriptExecutor)driver;
	  WebElement we = driver.findElement(By.id("username"));
	  jse.executeScript("arguments[0].value='manisha123@gmail.com';",we);
	  Thread.sleep(2000);
	  WebElement we1 = driver.findElement(By.id("password"));
	  jse.executeScript("arguments[0].value='manisha123';", we1);
	  Thread.sleep(2000);
  }
  @Test(priority=3)
  public void Highlight() throws InterruptedException
  {
	    jse = (JavascriptExecutor)driver;
		WebElement we4 = driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].style = 'border: 5px dotted red';",we4);
		Thread.sleep(2000);
  }
  @Test(priority = 4)
  public void CloseAUT()
  {
	  driver.quit();
  }
}
