package pl.javastart.examples.reflection;

import java.lang.reflect.Field;

public class PrintAllFields {

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        user.firstName = "Jan";
        user.setLastName("Kowalski");

        Class<? extends User> userClass = user.getClass();

        Field[] fields = userClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); // dostęp do metod prywatnych
            System.out.println(field.getName() + " -> " + field.get(user));
        }
    }

}

