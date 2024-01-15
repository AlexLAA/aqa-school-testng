package lesson.factory;

import static com.codeborne.selenide.Condition.text;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 15.01.2024
 */
public class FamousPersonBlockTests {

  public String name;

  public FamousPersonBlockTests(String name){
    this.name = name;
  }

  @BeforeClass
  public void googlePerson(){
    System.out.println(Thread.currentThread().getName()+ ": LET'S GOOGLE "+name);
    Selenide.open("https://google.com");
    Selenide.$("[name='q']").setValue(name).pressEnter();
  }

  @Test
  public void nameTitle(){
    Selenide.$("[data-attrid='title']").shouldHave(Condition.exactText(name));
  }

  @Test
  public void subtitleBlockPresent(){
    Selenide.$("[data-attrid='subtitle']").shouldBe(Condition.visible);
  }

  @Test
  public void ageBlockPresent(){
    Selenide.$("[data-attrid='lab/fact/Born']").shouldHave(text("Age"));
  }


}
