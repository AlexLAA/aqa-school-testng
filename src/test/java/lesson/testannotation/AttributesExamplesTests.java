package lesson.testannotation;

import org.testng.annotations.Test;

/**
 * Created by Lolik on 15.01.2024
 */
public class AttributesExamplesTests {

  public static int counter = 0;

  @Test(invocationCount = 10)
  public void invoke10Times(){
    System.out.println("TEST: invoke10Times: "+ ++counter);
  }

  @Test(invocationCount = 100, successPercentage = 30)
  public void testGambling(){
    counter++;
    if(counter%2==0)
      System.out.println("TEST: testGambling: "+ counter);
    else
      throw new AssertionError("TEST: testGambling: "+ counter);
  }

  @Test(expectedExceptions = ArithmeticException.class)
  public void divideByZero(){
System.out.println("TEST: divideByZero");
    int a = 1/0;
    System.out.println("TEST: divideByZero: "+a);
  }



}
