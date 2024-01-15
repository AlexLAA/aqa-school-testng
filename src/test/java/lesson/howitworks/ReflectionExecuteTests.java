package lesson.howitworks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class ReflectionExecuteTests {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException,
      IllegalAccessException {
    Class<?> c = Class.forName("lesson.howitworks.MyAwesomeTests");
    Object o = c.getDeclaredConstructor(null).newInstance();
    List<Method> testMethods = Arrays.stream(c.getMethods()).filter(m -> m.isAnnotationPresent(Test.class)).toList();
    testMethods.forEach(m -> invokeMethod(m, o));
  }

  public static void invokeMethod(Method method, Object o){
    try {
      method.invoke(o);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }


}
