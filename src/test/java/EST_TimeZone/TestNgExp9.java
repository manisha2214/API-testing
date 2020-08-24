package EST_TimeZone;

import org.testng.annotations.Test;

public class TestNgExp9 {
  @Test(priority = 2)
  public void A() {
	  System.out.println("This is restesting");
  }
  @Test(priority = 3)
  public void B()
  {
	  System.out.println("This is regression testing");
  }
  @Test(priority = 1)
  public void C()
  {
	  System.out.println("This is Smoke testing");
  }
  @Test(priority = 4)
  public void D()
  {
	  System.out.println("This is GUI testing");
  }
  @Test(priority = 5)
  public void E()
  {
	  System.out.println("This is system level testing");
  }
  
}
