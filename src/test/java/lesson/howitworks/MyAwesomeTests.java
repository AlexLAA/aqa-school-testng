package lesson.howitworks;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class MyAwesomeTests {

  @Test
  public void testMethod1(){
    System.out.println("TEST METHOD 1");
  }

  @Test
  public void testMethod2(){
    System.out.println("TEST METHOD 2");
  }

  //Actually this method is not a test method, because it has no @Test annotation
  public void testMethod3(){
    System.out.println("TEST METHOD 3");
  }

}
