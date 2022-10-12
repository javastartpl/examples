package pl.javastart.example.junits;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;


class UserBuilderTest {

    @Test
    public void shouldCreateUserWithGivenData() {
        // given
        pl.javastart.example.junits.UserBuilder userBuilder = new pl.javastart.example.junits.UserBuilder(null);
        String email = "user@example.com";
        String username = "magiczny_krzysztof";
        String avatar = "https://www.funny.pl/images/items/d7a84628c025d30f7b2c52c958767e76.jpg";

        // when
        pl.javastart.example.junits.User user = userBuilder.createUser(email, username, avatar);

        // then
        assertThat(user.getEmail()).isEqualTo(email);
        assertThat(user.getUsername()).isEqualTo(username);
        assertThat(user.getAvatar()).isEqualTo(avatar);
    }

    @Test
    public void shouldUseRandomUserData() {
        // given
        pl.javastart.example.junits.RandomUserService randomUserService = Mockito.mock(pl.javastart.example.junits.RandomUserService.class);
        pl.javastart.example.junits.RandomUserDto randomUserDto = new pl.javastart.example.junits.RandomUserDto();
        randomUserDto.setUsername("random_username_123");
        randomUserDto.setAvatar("http://example.com/image.jpg");
        Mockito.when(randomUserService.fetchRandomUser()).thenReturn(randomUserDto);

        pl.javastart.example.junits.UserBuilder userBuilder = new pl.javastart.example.junits.UserBuilder(randomUserService); // przekazujemy mock
        String email = "user@example.com";

        // when
        pl.javastart.example.junits.User user = userBuilder.createUser(email, null, null);

        // then
        assertThat(user.getEmail()).isEqualTo(email);
        assertThat(user.getUsername()).isEqualTo("random_username_123");
        assertThat(user.getAvatar()).isEqualTo("http://example.com/image.jpg");
    }

    @Test
    public void shouldNotCallApiIfNotNeeded() {
        // given
        String email = "user@example.com";
        String username = "magiczny_krzysztof";
        String avatar = "https://www.funny.pl/images/items/d7a84628c025d30f7b2c52c958767e76.jpg";
        pl.javastart.example.junits.RandomUserService randomUserService = Mockito.mock(pl.javastart.example.junits.RandomUserService.class);
        pl.javastart.example.junits.UserBuilder userBuilder = new pl.javastart.example.junits.UserBuilder(randomUserService);

        // when
        userBuilder.createUser(email, username, avatar);

        // then
        Mockito.verify(randomUserService, Mockito.never()).fetchRandomUser();
        Mockito.verifyNoInteractions(randomUserService);
    }

}