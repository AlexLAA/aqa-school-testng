package lesson.configuration;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class BeforeGroupExampleTests {

  @BeforeGroups({"group1"})
  public void beforeGroups(){
    System.out.println("BEFORE GROUP 1");
  }

  @AfterGroups({"group1"})
  public void afterGroups(){
    System.out.println("After GROUP 1");
  }


  @Test(groups = {"group1"})
  public void test1(){
    System.out.println("TEST 1 in group 1");
  }

  @Test(groups = {"group1"})
  public void test2(){
    System.out.println("TEST 2 in group 1");
  }

  @Test
  public void test3(){
    System.out.println("TEST 3");
  }

}
