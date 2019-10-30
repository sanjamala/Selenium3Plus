package testNGDemos;

import org.testng.annotations.Test;

public class TestNgDemo2 {
 
  @Test(priority=1)
  public void registration(){
  System.out.println("code for registartion");
  }
  @Test(priority=2)//ordering
  public void login(){
  System.out.println("code for login");
  }
  @Test(priority=3) //for blocking a test case from Execution
  public void forgotpswrd(){
  System.out.println("code for forgotpswrd");
  }
  
  @Test(enabled=false) //for blocking a test case from Execution
  public void blockexec(){
  System.out.println("code to block TC Execution");
  }

}
