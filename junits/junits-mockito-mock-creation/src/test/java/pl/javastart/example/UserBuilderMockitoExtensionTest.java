package pl.javastart.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

//@ExtendWith(MockitoExtension.class)
@MockitoSettings()
class UserBuilderMockitoExtensionTest {

    @Mock RandomUserService randomUserService;
    @InjectMocks UserBuilder userBuilder;

    @Test
    public void shouldNotCallApiIfNotNeeded() {
        // given
        String email = "user@example.com";
        String username = "magiczny_krzysztof";
        String avatar = "https://www.funny.pl/images/items/d7a84628c025d30f7b2c52c958767e76.jpg";

        // when
        userBuilder.createUser(email, username, avatar);

        // then
        Mockito.verify(randomUserService, Mockito.never()).fetchRandomUser();
        Mockito.verifyNoInteractions(randomUserService);
    }
}