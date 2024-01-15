package lesson.testannotation;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class DependsOnMethodExampleTest {

  @Test
  public void login() {
    System.out.println("Test: login");
  }

  @Test(dependsOnMethods = "login")
  public void uploadAvatar() {
    System.out.println("Test: uploadAvatar");
  }

  @Test(dependsOnMethods = "uploadAvatar")
  public void logout() {
    System.out.println("Test: logout");
  }


}
