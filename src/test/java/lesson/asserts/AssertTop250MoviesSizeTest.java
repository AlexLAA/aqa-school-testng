package lesson.asserts;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 15.01.2024
 */
public class AssertTop250MoviesSizeTest {

  @Test
  public void top250MoviesListSize() throws IOException {
    Document doc = Jsoup.connect("https://www.imdb.com/chart/top/").get();
    Elements top = doc.select("[data-testid='chart-layout-main-column'] h3");
    Assert.assertEquals(top.size(), 250, "Top 250 movies list size should be 250");
  }

  @Test
  public void top240MoviesListSize() throws IOException {
    Document doc = Jsoup.connect("https://www.imdb.com/chart/top/").get();
    Elements top = doc.select("[data-testid='chart-layout-main-column'] h3");
    Assert.assertEquals(top.size(), 240, "Top 240 movies list size should be 240");
  }

}
