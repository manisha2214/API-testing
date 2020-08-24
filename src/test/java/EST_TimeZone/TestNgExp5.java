package EST_TimeZone;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgExp5 {
  @BeforeMethod
  public void ClearMethod() {
	  System.out.println("This is test case one");
  }
  @Test
  public void SuperClassTc01()
  {
	  System.out.println("This is Login form");
  }
  @Test
  public void PrimaryTc02()
  {
	  System.out.println("This will execute AfterMethod");
  }
  @AfterMethod
  public void Tc04()
  {
	  System.out.println("This is the last option");
  }
}
