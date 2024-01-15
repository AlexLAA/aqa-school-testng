package lesson.parameters;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class FamousPersonTest {

  @Test
  public void famousPersonHasGoogleFeaturedArea() throws InterruptedException {
    Selenide.open("https://google.com");
    Selenide.$("[name='q']").setValue("Tom Brady").pressEnter();
    Selenide.$("[aria-label='Featured results']")
        .as("Famous Person Special Block")
        .shouldBe(Condition.visible);
    //Drill Sleep! Don't use it in Real life! Only if you really like other dudes!
    Thread.sleep(3000);
  }
}
