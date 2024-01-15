package lesson.parameters;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class FamousPersonParametrizedDefaultTest {

  @Test
  @Parameters({"name"})
  public void famousPersonHasGoogleFeaturedArea(@Optional("Jack Sparrow") String name) throws InterruptedException {
    Selenide.open("https://google.com");
    Selenide.$("[name='q']").setValue(name).pressEnter();
    Selenide.$("[aria-label='Featured results']")
        .as("Famous Person Special Block")
        .shouldBe(Condition.visible);
    //Drill Sleep! Don't use it in Real life! Only if you really like other dudes!
    Thread.sleep(3000);
  }
}
