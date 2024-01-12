package lesson;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 12.01.2024
 */
public class FirstSelenideTest {

  @Test
  public void top250MoviesPageTitle() {
    open("https://www.imdb.com/chart/top/");
    $("h1.ipc-title__text").shouldHave(text("IMDb Top 250 Movies"));
  }

}
