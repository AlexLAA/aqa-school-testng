package lesson.howitworks;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.testng.annotations.Test;

/**
 * Created by Lolik on 14.01.2024
 */
public class ReflectionPrivateExample {


  @Test
  public void hackThisPerson() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
      InstantiationException, IllegalAccessException, NoSuchFieldException {
    // Отримання класу за іменем
    Class<?> personClass = Class.forName("lesson.howitworks.SuperPrivatePerson");
    // Створення екземпляру класу Person
    Object personInstance = personClass.getConstructor().newInstance();
    // Отримання приватної змінної name за допомогою рефлексії
    Field nameField = personClass.getDeclaredField("name");
    // Дозвіл доступу до приватної змінної
    nameField.setAccessible(true);
    // Отримання значення приватної змінної
    String nameValue = (String) nameField.get(personInstance);
    // Виведення значення
    System.out.println("Call Budanov fater! We have a name: " + nameValue);
  }
}
