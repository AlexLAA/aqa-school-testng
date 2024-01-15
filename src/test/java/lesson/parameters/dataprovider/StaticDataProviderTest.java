package lesson.parameters.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 15.01.2024
 */
public class StaticDataProviderTest {

  @Test(dataProviderClass = StaticDataProviderStorage.class, dataProvider = "currencies")
  public void testCurrencyConverter(String currency){
    System.out.println(currency);
  }

  @Test(dataProviderClass = StaticDataProviderStorage.class, dataProvider = "roles")
  public void dashboardPageAvailable(ROLE role){
    System.out.println(role);
  }

}
