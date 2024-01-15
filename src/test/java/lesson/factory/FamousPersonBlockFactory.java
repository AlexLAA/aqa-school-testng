package lesson.factory;

import org.testng.annotations.Factory;

/**
 * Created by Lolik on 15.01.2024
 */
public class FamousPersonBlockFactory {

  @Factory
  public Object[] createInstances() {
   return new Object[]{
       new FamousPersonBlockTests("Tom Cruise"),
       new FamousPersonBlockTests("Arnold Schwarzenegger"),
       new FamousPersonBlockTests("Bruce Willis"),
       new FamousPersonBlockTests("Sylvester Stallone"),
   };
  }
}
