package lesson.asserts;

import lesson.LolikCalculator;
import lesson.LolikStringParser;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 12.01.2024
 */
public class AssertExamplesTest {

  @Test
  public void assertsExamples(){
    Assert.assertNotNull(new Object(), "Object is null");
    Assert.assertNull(null, "Object is not null");
    Assert.assertTrue(true, "Boolean is not true");
    Assert.assertFalse(false, "Boolean is not false");
    Assert.assertEquals(1, 1, "Numbers are not equal");
    Assert.assertNotEquals(1, 2, "Numbers are equal");
    Assert.assertSame(1, 1, "Objects are not same");
    Assert.assertNotSame(1, 2, "Objects are same");
  }


  @Test
  public void testSum() {
    int sum = LolikCalculator.sum(2, 2);
    Assert.assertEquals(sum, 4, "Sum is not correct");
  }

  @Test
  public void testSub() {
    int sub = LolikCalculator.sub(2, 2);
    Assert.assertEquals(sub, 0, "Subtraction is not correct");
  }

  @Test
  public void testStringParser() {
    String str = "TestString";
    boolean lolik = LolikStringParser.isLowerCase(str);
    Assert.assertTrue(lolik, str + " is not lower case");
  }

  @Test
  public void failedTest(){
    Assert.fail("This test is failed");
  }


}
