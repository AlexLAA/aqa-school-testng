package lesson.testannotation;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class PriorityExampleTest {

  @Test(priority = 3)
  public void testA() {
    System.out.println("Test: A");
  }

  @Test(priority = 2)
  public void testB() {
    System.out.println("Test: B");
  }

  @Test(priority = 1)
  public void testC() {
    System.out.println("Test: C");
  }
}
