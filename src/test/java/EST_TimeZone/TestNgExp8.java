package EST_TimeZone;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExp8 {
  @BeforeClass
  public void bf() {
	  System.out.println("This will execute first in class");
  }
  @BeforeTest
  public void bTest()
  {
	  System.out.println("This will execute before test");
	  System.out.println("------------");
  }
  @Test
  public void printsome()
  {
	  System.out.println(" This is Tc01, retesting");
  }
  @Test
  public void printsome12()
  {
	  System.out.println("This is test  case 2,regression testing");
  }
  @AfterMethod
  public void MethodA()
  {
	  System.out.println("-----------------");
	  System.out.println("This will execute AfterMethod");
	  
  }
  @AfterTest
  public void ATest()
  {
	  System.out.println("This is execute aftertEST");
  }
}
