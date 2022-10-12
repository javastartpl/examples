package pl.javastart.example.junits;

public class App {
    public static void main(String[] args) {
        pl.javastart.example.junits.UserBuilder userBuilder = new pl.javastart.example.junits.UserBuilder(new pl.javastart.example.junits.RandomUserService());
        pl.javastart.example.junits.User user = userBuilder.createUser("email@example.com", null, null);
        System.out.println(user);
    }
}
