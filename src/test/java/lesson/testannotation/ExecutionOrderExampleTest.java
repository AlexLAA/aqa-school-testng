package lesson.testannotation;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class ExecutionOrderExampleTest {


  @Test
  public void test1() {
    System.out.println("Test: 1");
  }

  @Test
  public void testA() {
    System.out.println("Test: A");
  }

/*
  @Test
  public void testAA() {
    System.out.println("Test: AA");
  }
*/

  @Test
  public void testB() {
    System.out.println("Test: B");
  }

  @Test
  public void testC() {
    System.out.println("Test: C");
  }

}
