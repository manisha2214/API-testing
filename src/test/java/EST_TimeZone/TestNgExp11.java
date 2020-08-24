package EST_TimeZone;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExp11 {
	WebDriver driver;
  @BeforeClass
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test(priority = 1,description= "This is search box")
  public void SendData() throws InterruptedException
  {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");
	  Thread.sleep(2000);
  }
  @Test(priority = 2,description= "This is Click bottom")
  public void Click() throws InterruptedException
  {
	  driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
	  Thread.sleep(2000);
  }
  @Test(priority = 3)
  public void Close()
  {
	  driver.close();
  }
}
