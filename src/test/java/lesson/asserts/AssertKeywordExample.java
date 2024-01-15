package lesson.asserts;

import lesson.LolikCalculator;

/**
 * Created by Lolik on 14.01.2024
 */
public class AssertKeywordExample {


  //Enable -ea flag in VM options to see assertions
  public static void main(String[] args){
    int a = 10;
    int b = 20;
    int sum = LolikCalculator.sum(a, b);
    assert 30 == sum;
    int sub = LolikCalculator.sub(sum, b);
    assert 10 == sub;
    int mult = LolikCalculator.mult(sub, 2);
    assert 10 == mult;
  }


}
