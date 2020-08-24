package EST_TimeZone;

import org.junit.AfterClass;
import org.junit.BeforeClass;


import org.testng.annotations.Test;

public class TestNgExp6 {
  @BeforeClass
  public void BeforeF() {
	  System.out.println("This will execute first in class");
  }
  @Test
  public void PrintSomething()
  {
	  System.out.println("This is Test case one");
  }
  @Test
  public void SayHello()
  {
	  System.out.println("Hello");
  }
  @AfterClass
  public void AfterF()
  {
	  System.out.println("This is the last option");
  }
}
