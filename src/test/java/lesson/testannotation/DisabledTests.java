package lesson.testannotation;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class DisabledTests {

  @Test
  public void testA() {
    System.out.println("Test: A");
  }

  @Test
  public void testB() {
    System.out.println("Test: B");
  }

  @Test(enabled = false)
  public void testWithSomeIssue() {
    System.out.println("Test: C");
  }
}
