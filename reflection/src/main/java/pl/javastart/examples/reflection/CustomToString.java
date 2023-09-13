package pl.javastart.examples.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CustomToString {

    public static void main(String[] args) throws IllegalAccessException {

        User user = new User();
        user.firstName = "Jan";
        user.setLastName("Kowalski");

        printObject(user);
        System.out.println(user);
    }

    private static void printObject(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(clazz.getSimpleName());
        stringBuilder.append("{");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            stringBuilder.append(declaredField.getName());
            stringBuilder.append("='");
            stringBuilder.append(declaredField.get(object));
            stringBuilder.append("', ");
        }
        String substring = stringBuilder.substring(0, stringBuilder.length() - 2);
        System.out.println(substring + "}");
    }


}

