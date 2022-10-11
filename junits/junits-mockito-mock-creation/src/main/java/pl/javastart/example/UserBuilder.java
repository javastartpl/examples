package pl.javastart.example;

public class UserBuilder {

    private RandomUserService randomUserService;

    public UserBuilder(RandomUserService randomUserService) {
        this.randomUserService = randomUserService;
    }

    public User createUser(String email, String username, String avatar) {
        User user = new User();
        user.setEmail(email);

        RandomUserDto randomUserDto = null;
        if (username == null || avatar == null) {
            randomUserDto = randomUserService.fetchRandomUser();
        }
        user.setAvatar(avatar != null ? avatar : randomUserDto.getAvatar());
        user.setUsername(username != null ? username : randomUserDto.getUsername());

        return user;
    }
}
