package lesson.parameters.dataprovider;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class DynamicDataProviderTest {

  @Test(dataProvider = "persons")
  public void famousPersonHasGoogleFeaturedArea(String name) throws InterruptedException {
    Selenide.open("https://google.com");
    Selenide.$("[name='q']").setValue(name).pressEnter();
    Selenide.$("[aria-label='Featured results']")
        .as("Famous Person Special Block")
        .shouldBe(Condition.visible);
    //Drill Sleep! Don't use it in Real life! Only if you really like other dudes!
    Thread.sleep(1000);
  }

  @DataProvider(name = "persons")
  public Iterator<String> persons() {
    List<String> castOfTheMovie = getCastOfTheMovie("https://www.imdb.com/title/tt7203552/fullcredits");
    return castOfTheMovie.stream().limit(10)
        .toList().iterator();
  }

  public List<String> getCastOfTheMovie(String imdbUrl){
    List<String> cast = new ArrayList<>();
    Selenide.open(imdbUrl);
    Selenide.$$(".cast_list .primary_photo img").forEach(element -> cast.add(element.attr("title")));
    return cast;
  }

}
