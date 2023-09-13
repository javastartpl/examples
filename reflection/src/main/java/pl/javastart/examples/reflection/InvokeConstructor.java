package pl.javastart.examples.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeConstructor {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<? extends User> userClass = User.class;

        Constructor<? extends User> constructor1 = userClass.getConstructor();// kontruktor bezargumentowy
        Constructor<? extends User> constructor2 = userClass.getConstructor(String.class, String.class);// konstruktor przyjmujący imię i nazwisko

        User user1 = constructor1.newInstance();
        System.out.println(user1);

        User user2 = constructor2.newInstance("Anna", "Nowak");
        System.out.println(user2);
    }
}

