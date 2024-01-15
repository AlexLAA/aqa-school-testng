package lesson.parallel;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 15.01.2024
 */
public class SharedResourceTest {

  // Shared counter among test methods
  private int counter = 0;

  @Test
  public void testMethod1() throws InterruptedException {
    // Simulate using a shared resource (e.g., a counter)
    counter++;
    Thread.sleep(1000);
    System.out.println(Thread.currentThread().getName()+ " TestMethod1 - Counter: " + counter);
  }

  @Test
  public void testMethod2() throws InterruptedException {
    // Simulate using the same shared resource
    counter++;
    Thread.sleep(1000);
    System.out.println(Thread.currentThread().getName()+ " TestMethod2 - Counter: " + counter);
  }

}
