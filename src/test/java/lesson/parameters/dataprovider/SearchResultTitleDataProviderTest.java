package lesson.parameters.dataprovider;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class SearchResultTitleDataProviderTest {

  @Test(dataProvider = "persons")
  public void personTitleOnResultPage(String name) throws InterruptedException {
    Selenide.open("https://google.com");
    Selenide.$("[name='q']").setValue(name).pressEnter();
    Selenide.$("[data-attrid='title']").shouldHave(Condition.exactText(name));
    //Drill Sleep! Don't use it in Real life! Only if you really like other dudes!
    Thread.sleep(3000);
  }

  @DataProvider(name = "persons")
  public Object[][] persons() {
    return new Object[][] {
        {"Tom Brady"},
        {"Tom Hanks"},
        {"Tom Cruise"},
        {"Tom Hardy"},
        {"Jack Sparrow"}
    };
  }
}
