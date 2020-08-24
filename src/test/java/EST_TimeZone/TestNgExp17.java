package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNgExp17 {
	WebDriver driver;
  @Test
  public void LaunchAUT() {
	  ChromeOptions oc=new ChromeOptions();
	  oc.addArguments("--headless");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver(oc);
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  String tittle = driver.getTitle();
	  System.out.println("the tittle is:"+ tittle);
	  WebElement we1 = driver.findElement(By.name("q"));
	  we1.sendKeys("javabooks");
	  we1.click();
  }
  public void CloseAUT()
  {
	  driver.close();
	  driver.quit();
  }
}
