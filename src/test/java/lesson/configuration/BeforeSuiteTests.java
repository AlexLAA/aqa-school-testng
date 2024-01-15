package lesson.configuration;

import org.testng.annotations.BeforeSuite;

/**
 * Created by Lolik on 14.01.2024
 */
public class BeforeSuiteTests {

  @BeforeSuite
  public void createDataForTests(){
    System.out.println("BEFORE SUITE");
  }



}
