package lesson.parallel;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 15.01.2024
 */
public class SecondParallelTest {

  @Test
  public void testA() {
    System.out.println(Thread.currentThread()+" "+"SecondParallelTest - testA");
  }

  @Test
  public void testB() {
    System.out.println(Thread.currentThread()+" "+"SecondParallelTest - testB");
  }

  @Test
  public void testC() throws InterruptedException {
    Thread.sleep(1000);
    System.out.println(Thread.currentThread()+" "+"SecondParallelTest - testC");
  }

  @Test
  public void testD() {
    System.out.println(Thread.currentThread()+" "+"SecondParallelTest - testD");
  }

  @Test
  public void testE() {
    System.out.println(Thread.currentThread()+" "+"SecondParallelTest - testE");
  }

}
