package testNGAnnotations_Flags;

import org.testng.annotations.Test;

public class Flag5 {
  @Test(description = "Performs Login")
  public void loginMethod() 
  {
	  System.out.println("It is use to perform login!!");
  }
  @Test(description = "Performs create user",dependsOnMethods = "loginMethod")
 public void createUserMethod()
 {
	  System.out.println("user Created!!");
 }
  @Test(description = "Performs login",dependsOnMethods = "createUserMethod")
 public void logoutMehod()
 {
	  System.out.println("It is use to perform logOut!!");
 }
}
