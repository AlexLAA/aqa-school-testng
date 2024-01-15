package lesson.asserts;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Lolik on 15.01.2024
 */
public class SoftAssertTop10MoviesOrderTest {

  @Test
  public void top10MoviesOrder() throws IOException {
    Document doc = Jsoup.connect("https://www.imdb.com/chart/top/").get();
    Elements top = doc.select("[data-testid='chart-layout-main-column'] h3");

    Assert.assertEquals(top.size(), 250, "Top 250 movies list size should be 250");

    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(top.get(0).text(), "1. Втеча з Шоушенка");
    softAssert.assertEquals(top.get(1).text(), "2. Хрещений батько");
    softAssert.assertEquals(top.get(2).text(), "3. Темний лицар");
    softAssert.assertEquals(top.get(3).text(), "4. Хрещений батько 2");
    softAssert.assertEquals(top.get(4).text(), "5. 12 розгніваних чоловіків");
    softAssert.assertEquals(top.get(5).text(), "6. Список Шиндлера");
    softAssert.assertEquals(top.get(6).text(), "7. Нація убивць");
    softAssert.assertEquals(top.get(7).text(), "8. Кримінальне чтиво");
    softAssert.assertEquals(top.get(8).text(), "9. Володар перснів: Хранителі персня");
    softAssert.assertEquals(top.get(9).text(), "10. Хороший, поганий, злий");
    softAssert.assertAll();

  }

}
