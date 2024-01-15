package lesson.howitworks;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class ExceptionInTest {

  @Test
  public void myTestWithError(){
    throw new AssertionError("Exception in test method");
  }

}
