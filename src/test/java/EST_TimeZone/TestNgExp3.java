package EST_TimeZone;

import org.testng.annotations.Test;

public class TestNgExp3 {
  @Test(priority = 4)
  public void f() {
	  System.out.println("America");
}
  @Test(priority = 2)
  public void d()
  {
	  System.out.println("Australia");
  }
  @Test(priority = 1)
  public void h()
  {
	  System.out.println("Canada");
  }
  @Test(priority = 5)
  public void j()
  {
	  System.out.println("Japan");
  }
  @Test(priority = 6)
  public void k()
  {
	  System.out.println("China");
  }
  @Test(priority=3)
  public void y()
  {
	  System.out.println("Nepal");
  }
  @Test(priority=7)
  public void p()
  {
	  System.out.println("India");
  }
  
}
