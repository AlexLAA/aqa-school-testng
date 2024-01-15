package lesson.asserts;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Lolik on 14.01.2024
 */
public class SoftAssertExample {

  OkHttpClient client = new OkHttpClient();

  @Test
  public void apiCall() throws IOException {
    Request request = new Request.Builder().url("https://httpbin.org/get").get().build();
    Response response = client.newCall(request).execute();
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(response.code(), 200);
    softAssert.assertEquals(response.header("Server"), "gunicorn/19.9.0");
    softAssert.assertEquals(response.header("Content-Type"), "application/json");
    softAssert.assertAll();
  }
}
