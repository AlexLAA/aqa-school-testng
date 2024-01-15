package lesson.configuration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class AllConfigurationMethodsExample {

  @BeforeSuite
  public void beforeSuite(){
    System.out.println("BEFORE SUITE");
  }

  @BeforeTest
  public void beforeTest(){
    System.out.println("BEFORE TEST");
  }

  @BeforeClass
  public void beforeClass(){
    System.out.println("BEFORE CLASS");
  }

  @BeforeMethod
  public void beforeMethod(){
    System.out.println("BEFORE METHOD");
  }

  @Test
  public void test1(){
    System.out.println("TEST 1");
  }

  @Test
  public void test2(){
    System.out.println("TEST 2");
  }

}
