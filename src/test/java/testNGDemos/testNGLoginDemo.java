package testNGDemos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGLoginDemo {
  @Test(invocationCount=5, enabled=false)
  
  public void login() {
	  System.out.println("Repeated Execution with same data");
  }
  @Test(invocationCount=5)
  public void login2() {
	  System.out.println("login-step2: Repeated Execution with same data");
  }
  
  //Grouping Concept
  
  @Test(groups= {"Sanity","Regression"})
  public void login3() {
	  System.out.println("login3");
  }
  @Test(groups= {"Sanity"})
  public void launch() {
	  System.out.println("launch");
  }
  @Test(groups= {"Smoke"})
  public void registration() {
	  System.out.println("registration");
  }
  @Test(groups= {"Regression","UAT"})
  @Parameters({"location","DCNO"})
  public void addCart(String location, String DCNO) {
	  System.out.println("addCart");
	  System.out.println("location");
	  System.out.println("DCNO");
  }
  @Test(groups= {"Sanity","UAT"})
  @Parameters({"location","DCNO"})
  public void removeCart(String location, String DCNO) {
	  System.out.println("removeCart");
	  System.out.println("location");
	  System.out.println("DCNO");
	  
  }
  
}
