package lesson.parameters.dataprovider;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.testng.annotations.DataProvider;

/**
 * Created by Lolik on 15.01.2024
 */
public class StaticDataProviderStorage {

  @DataProvider(name = "currencies")
  public static Iterator<String> currencies(){
    return List.of("USD", "EUR", "UAH").iterator();
  }

  @DataProvider(name = "roles")
  public static Iterator<ROLE> roles(){
    return Arrays.stream(ROLE.values()).toList().iterator();
  }


}
