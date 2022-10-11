package pl.javastart.example;

public class App {
    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder(new RandomUserService());
        User user = userBuilder.createUser("email@example.com", null, null);
        System.out.println(user);
    }
}
