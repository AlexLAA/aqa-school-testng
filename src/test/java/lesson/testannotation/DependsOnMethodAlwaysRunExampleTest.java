package lesson.testannotation;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class DependsOnMethodAlwaysRunExampleTest {

  @Test
  public void login() {
    System.out.println("Test: login");
  }

  @Test(dependsOnMethods = "login")
  public void uploadAvatar() {
    System.out.println("Test: uploadAvatar");
    Assert.fail("Failed to upload avatar");
  }

  @Test(dependsOnMethods = "login")
  public void changeName() {
    System.out.println("Test: changeName");
  }

  @Test(dependsOnMethods = {"uploadAvatar", "changeName"}, alwaysRun = true)
  public void logout() {
    System.out.println("Test: logout");
  }


}
