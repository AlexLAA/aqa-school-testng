package lesson.parameters.dataprovider;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class SearchResultTitleDataProviderWithExpectedTest {

  @Test(dataProvider = "persons")
  public void personTitleOnResultPage(String searchName, String expectedName) throws InterruptedException {
    Selenide.open("https://google.com");
    Selenide.$("[name='q']").setValue(searchName).pressEnter();
    Selenide.$("[data-attrid='title']").shouldHave(Condition.exactText(expectedName));
    //Drill Sleep! Don't use it in Real life! Only if you really like other dudes!
    Thread.sleep(3000);
  }

  @DataProvider(name = "persons")
  public Object[][] persons() {
    return new Object[][] {
        {"Tom Brady", "Tom Brady"},
        {"Tom Hanks", "Tom Hanks"},
        {"Tom Cruise", "Tom Cruise"},
        {"Tom Hardy", "Tom Hardy"},
        {"Jack Sparrow", "Captain Jack Sparrow"}
    };
  }
}
