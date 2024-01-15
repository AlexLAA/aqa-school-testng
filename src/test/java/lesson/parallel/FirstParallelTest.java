package lesson.parallel;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 15.01.2024
 */
public class FirstParallelTest {

  @Test
  public void test1() {
    System.out.println(Thread.currentThread()+" "+"FirstInstancesParallelTest - test1");
  }

  @Test
  public void test2() {
    System.out.println(Thread.currentThread()+" "+"FirstInstancesParallelTest - test2");
  }

  @Test
  public void test3() {
    System.out.println(Thread.currentThread()+" "+"FirstInstancesParallelTest - test2");
  }

  @Test
  public void test4() {
    System.out.println(Thread.currentThread()+" "+"FirstInstancesParallelTest - test4");
  }
}
