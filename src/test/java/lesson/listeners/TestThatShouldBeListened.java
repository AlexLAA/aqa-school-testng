package lesson.listeners;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
@Listeners({CustomTestListener.class})
public class TestThatShouldBeListened {

  @Test
  public void simpleTest1(){
    Selenide.open("https://google.com");
    Assert.fail("Some Fail");
  }


}
