package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExp10 {
	WebDriver driver;
  @Test(priority = 1, description = "This will execute the website")
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://login.salesforce.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }
  @Test(priority = 2, description = "This is user details")
  public void SendData() throws InterruptedException
  {
	  driver.findElement(By.id("username")).sendKeys("manisha345@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("password")).sendKeys("manisha456");
	  Thread.sleep(2000);
	  
  }
  @Test(priority = 3, description = "This is click action" )
  public void Click() throws InterruptedException
  {
	  driver.findElement(By.id("Login")).click();
	  Thread.sleep(2000);
  }
  public void close()
  {
	  driver.close();
  }
}
