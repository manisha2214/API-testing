package EST_TimeZone;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgExp7 {
  @BeforeClass
  public void BeforeFunction() {
	  System.out.println("This is execute first in the class");
  }
  @BeforeMethod
  public void Method()
  {
	  System.out.println("This will execute before method");
  }
  @Test
  public void PrintSome()
  {
	  System.out.println("This is test case 1");
  }
  @Test
  public void PrintSomething()
  {
	  System.out.println("This is test case test case 2");
  }
  @AfterClass
  public void AfterFunction()
  {
	  System.out.println("-------------");
	  System.out.println("This will execute after test case");
  }
  @AfterMethod
  public void lastclass()
  {
	  System.out.println("------------");
	  System.out.println("This will execute at the end of the class");
  }
}
