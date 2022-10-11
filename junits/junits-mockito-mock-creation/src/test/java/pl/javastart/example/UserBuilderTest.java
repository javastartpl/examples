package pl.javastart.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class UserBuilderTest {

    @Mock RandomUserService randomUserService;

    @Test
    public void shouldCreateUserWithGivenData() {
        // given
        UserBuilder userBuilder = new UserBuilder(null);
        String email = "user@example.com";
        String username = "magiczny_krzysztof";
        String avatar = "https://www.funny.pl/images/items/d7a84628c025d30f7b2c52c958767e76.jpg";

        // when
        User user = userBuilder.createUser(email, username, avatar);

        // then
        assertThat(user.getEmail()).isEqualTo(email);
        assertThat(user.getUsername()).isEqualTo(username);
        assertThat(user.getAvatar()).isEqualTo(avatar);
    }

    @Test
    public void shouldUseRandomUserData() {
        // given
        RandomUserService randomUserService = mock(RandomUserService.class);
        RandomUserDto randomUserDto = new RandomUserDto();
        randomUserDto.setUsername("random_username_123");
        randomUserDto.setAvatar("http://example.com/image.jpg");
        Mockito.when(randomUserService.fetchRandomUser()).thenReturn(randomUserDto);

        UserBuilder userBuilder = new UserBuilder(randomUserService); // przekazujemy mock
        String email = "user@example.com";

        // when
        User user = userBuilder.createUser(email, null, null);

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
    RandomUserService randomUserService = mock(RandomUserService.class, new Answer() {
        @Override
        public Object answer(InvocationOnMock invocation) throws Throwable {
            throw new RuntimeException("Not implemented");
        }
    });
    UserBuilder userBuilder = new UserBuilder(randomUserService);

    // when
    userBuilder.createUser(email, username, avatar);

    // then
    Mockito.verify(randomUserService, Mockito.never()).fetchRandomUser();
    Mockito.verifyNoInteractions(randomUserService);
}

}