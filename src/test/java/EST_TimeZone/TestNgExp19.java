package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNgExp19 {
	WebDriver driver;
  @Test
  public void LaunchAUT() {
	  ChromeOptions coobj= new ChromeOptions();
	  coobj.addArguments("--headless");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver(coobj);
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  String Tittle = driver.getTitle();
	  System.out.println("The tittle is:"+ Tittle);
	  driver.findElement(By.name("field-keywords")).sendKeys("selenium");
	  driver.findElement(By.className("nav-input")).click();
	  
  }
  public void CloseAUT()
  {
	  driver.quit();
  }
  
}
