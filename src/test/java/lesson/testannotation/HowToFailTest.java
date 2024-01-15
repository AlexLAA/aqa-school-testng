package lesson.testannotation;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class HowToFailTest {

  @Test
  public void failThisTest(){
    Assert.fail("This test is failed");
  }

}
