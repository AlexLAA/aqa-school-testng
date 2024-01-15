package lesson.configuration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class BeforeAfterMethodExampleTests {


  @BeforeMethod
  public void beforeMethod(){
    Selenide.open("https://google.com");
  }

  @AfterMethod
  public void closeBrowser(){
    Selenide.closeWebDriver();
  }

  @Test
  public void searchTomBrady() throws InterruptedException {
    Selenide.$("[name='q']").setValue("Tom Brady").pressEnter();
    Selenide.$("[data-attrid='title']").shouldHave(Condition.text("Tom Brady"));
    //Drill Sleep! Don't use it in Real life! Only if you really like other dudes!
    Thread.sleep(3000);
  }

  @Test
  public void searchTomHanks() throws InterruptedException {
    Selenide.$("[name='q']").setValue("Tom Hanks").pressEnter();
    Selenide.$("[data-attrid='title']").shouldHave(Condition.text("Tom Brady"));
    //Drill Sleep! Don't use it in Real life! Only if you really like other dudes!
    Thread.sleep(3000);
  }

  @Test
  public void searchTomCruise() throws InterruptedException {
    Selenide.$("[name='q']").setValue("Tom Cruise").pressEnter();
    Selenide.$("[data-attrid='title']").shouldHave(Condition.text("Tom Cruise"));
    //Drill Sleep! Don't use it in Real life! Only if you really like other dudes!
    Thread.sleep(3000);
  }


}
