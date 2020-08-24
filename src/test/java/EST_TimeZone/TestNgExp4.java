package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExp4 {
	WebDriver driver;
  @Test
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test
  public void Senddata() throws InterruptedException
  {
	  driver.findElement(By.id("email")).sendKeys("manisha@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("pass")).sendKeys("manisha2765");
	  Thread.sleep(2000);
	  
  }
  @Test
  public void clickonlogin() throws InterruptedException
  {
	  driver.findElement(By.linkText("Log In")).click();
	  Thread.sleep(2000);
  }
  @Test
  public void closeAUT()
  {
	  driver.close();
  }
}
