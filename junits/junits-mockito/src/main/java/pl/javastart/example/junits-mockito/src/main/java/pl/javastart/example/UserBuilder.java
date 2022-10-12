package pl.javastart.example.junits;

public class UserBuilder {

    private pl.javastart.example.junits.RandomUserService randomUserService;

    public UserBuilder(pl.javastart.example.junits.RandomUserService randomUserService) {
        this.randomUserService = randomUserService;
    }

    public pl.javastart.example.junits.User createUser(String email, String username, String avatar) {
        pl.javastart.example.junits.User user = new pl.javastart.example.junits.User();
        user.setEmail(email);

        pl.javastart.example.junits.RandomUserDto randomUserDto = null;
        if (username == null || avatar == null) {
            randomUserDto = randomUserService.fetchRandomUser();
        }
        user.setAvatar(avatar != null ? avatar : randomUserDto.getAvatar());
        user.setUsername(username != null ? username : randomUserDto.getUsername());

        return user;
    }
}
