package lesson.testannotation;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class DependsOnMethodAnotherClassTest {

  @Test(dependsOnMethods = "lesson.testannotation.DependsOnMethodExampleTest.login")
  public void updateProfileName() {
    System.out.println("Test: updateProfileName");
  }

}
