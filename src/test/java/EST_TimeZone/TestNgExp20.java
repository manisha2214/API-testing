package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNgExp20 {
	WebDriver driver;
	JavascriptExecutor jse;
	Actions actobj;
  @Test(priority = 1)
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://login.salesforce.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test(priority = 2)
  public void SendDataactions() throws InterruptedException
  {
	  Actions actobj = new Actions(driver);
	  WebElement we = driver.findElement(By.id("username"));
	  actobj.sendKeys(we, "manisha@gmail.com").perform();
	  Thread.sleep(2000);
  }
  @Test(priority = 3)
  public void senddatausingjavascript() throws InterruptedException
  {
	 jse = (JavascriptExecutor)driver;
	 WebElement we2 = driver.findElement(By.name("pw"));
	 jse.executeScript("arguments[0].value='manisisha123';", we2);
	 Thread.sleep(2000);
	 jse.executeScript("arguments[0].style='border:5px solid black';", we2);
	 Thread.sleep(2000);
	 
	 
  }
  @Test(priority = 5)
  public void scroll() throws InterruptedException
  {
	  jse=(JavascriptExecutor)driver;
	  jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(2000);
	  jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  Thread.sleep(2000);
  }
  @Test(priority = 4)
  public void Navigator() throws InterruptedException
  {
	  driver.navigate().to("https://www.amazon.com/");
	  driver.navigate().refresh();
	  driver.navigate().back();
	  driver.navigate().forward();
	  
  }
  @Test(priority = 6)
  public void closeAUT()
  {
	  driver.quit();
  }
}
