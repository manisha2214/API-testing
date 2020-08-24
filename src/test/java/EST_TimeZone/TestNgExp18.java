package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExp18 {
	WebDriver driver;
  @Test(priority = 1)
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test(priority = 2)
  public void InputData()
  {
	  driver.switchTo().frame("iframeResult");
	 WebElement we = driver.findElement(By.xpath("//input[@id='fname']"));
	 //verify the element is enabled or not
	 if(we.isEnabled())
	 {
		we.clear();
		we.sendKeys("manisha");
		
	 }
	 else
	 {
		 System.out.println("Element is disabled! cannot enter data");
	 }
	 WebElement we1 = driver.findElement(By.xpath("//input[@id='lname']"));
	 //validate last name field is enabled or not
	 if(we1.isEnabled())
	 {
		 we1.clear();
		 we1.sendKeys("shrestha");
		 
	 }
	 else
	 {
		 System.out.println("Element is diabled! cannot enter data");
	 }
  }
  @Test(priority = 3)
	 public void closeAUT()
	 {
		 driver.close();
	 }
  }

