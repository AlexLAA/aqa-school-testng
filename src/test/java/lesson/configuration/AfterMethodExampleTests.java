package lesson.configuration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class AfterMethodExampleTests {

  @BeforeClass
  public void openGoogle(){
    Selenide.open("https://google.com");
  }

  @AfterMethod
  public void closeBrowser(){
    Selenide.back();
  }


  @Test
  public void searchTomBrady() throws InterruptedException {
    Selenide.$("[name='q']").setValue("Tom Brady").pressEnter();
    Selenide.$("[data-attrid='title']").shouldHave(Condition.text("Tom Brady"));
    //Drill Sleep! Don't use it in Real life! Only if you really like other dudes!
    Thread.sleep(5000);
  }

  @Test
  public void serachTomHanks() throws InterruptedException {
    Selenide.$("[name='q']").setValue("Tom Hanks").pressEnter();
    Selenide.$("[data-attrid='title']").shouldHave(Condition.text("Tom Brady"));
    //Drill Sleep! Don't use it in Real life! Only if you really like other dudes!
    Thread.sleep(5000);
  }

  @Test
  public void serachTomCruise() throws InterruptedException {
    Selenide.$("[name='q']").setValue("Tom Cruise").pressEnter();
    Selenide.$("[data-attrid='title']").shouldHave(Condition.text("Tom Cruise"));
    //Drill Sleep! Don't use it in Real life! Only if you really like other dudes!
    Thread.sleep(5000);
  }

}
