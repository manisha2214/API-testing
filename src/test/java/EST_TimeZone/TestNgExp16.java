package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExp16 {
	WebDriver driver;
	JavascriptExecutor jse;
  @Test(priority = 1)
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test(priority = 2)
  public void SendData() throws InterruptedException
  {
	  jse =(JavascriptExecutor)driver;
	  WebElement we = driver.findElement(By.id("twotabsearchtextbox"));
	  jse.executeScript("arguments[0].value='macbook';",we);
	  Thread.sleep(2000);
  }
  @Test(priority=4)
  public void click() throws InterruptedException
  {
	  jse = (JavascriptExecutor)driver;
	  WebElement we1 = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"));
	  jse.executeScript("arguments[0].click", we1);
	  Thread.sleep(2000);
	  
  }
  @Test(priority=3)
  public void Highlight() throws InterruptedException
  {
	  jse=(JavascriptExecutor)driver;
	  WebElement we2 = driver.findElement(By.id("twotabsearchtextbox"));
	  jse.executeScript("arguments[0].style='border:5px solid red';", we2);
	  Thread.sleep(2000);
	  
	  
  }
  @Test(priority = 6)
  public void pagescrolling() throws InterruptedException
  {//top to bottom
	  jse = (JavascriptExecutor)driver;
		//scroll to bottom
		jse.executeScript( "window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		//scroll to Top
		jse.executeScript("window.scrollTo(document.body.scrolHeight,0)");
		Thread.sleep(2000);

	  
  }
  @Test(priority = 7)
  public void gettittle() throws InterruptedException
  {
	  jse = (JavascriptExecutor)driver;
	  String page_tittle = jse.executeScript("return document.tittle;").toString();
	  System.out.println("The title is:"+ page_tittle);
	  Thread.sleep(2000);
	  
  }
  @Test(priority = 8)
  public void getinnerText() throws InterruptedException
  {
	  jse = (JavascriptExecutor)driver;
	  String inner_text = jse.executeScript("return document.document.Element.innerText;").toString();
	  System.out.println("The inner text is:"+ inner_text);
	  Thread.sleep(2000);
  }
  @Test(priority =5)
  public void refreshthepage()
  {
	  jse = (JavascriptExecutor)driver;
	  jse.executeScript("history.go(0);");
  }
  @Test(priority = 9)
  public void CloseAUT()
  {
	  driver.close();
  }
}
