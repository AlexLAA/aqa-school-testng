package lesson.testannotation;

import org.testng.SkipException;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class HowToSkipTest {

  @Test
  public void skipThisTest(){
    throw new SkipException("This test is skipped");
  }

}
