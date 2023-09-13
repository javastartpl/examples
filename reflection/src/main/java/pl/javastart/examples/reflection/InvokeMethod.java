package pl.javastart.examples.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethod {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        user.firstName = "Jan";
        user.setLastName("Kowalski");

        Class<? extends User> userClass = user.getClass();

        Method setLastNameMethod = userClass.getMethod("setLastName", String.class);
        setLastNameMethod.invoke(user, "Nowak");

        System.out.println(user);
    }

}

