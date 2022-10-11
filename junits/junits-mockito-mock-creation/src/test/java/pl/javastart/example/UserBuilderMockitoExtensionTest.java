package pl.javastart.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserBuilderMockitoExtensionTest {

    @Mock RandomUserService randomUserService;
    private AutoCloseable closeable;

    @BeforeEach
    void init() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void cleanup() throws Exception {
        closeable.close();
    }

    @Test
    public void shouldNotCallApiIfNotNeeded() {
        // given
        String email = "user@example.com";
        String username = "magiczny_krzysztof";
        String avatar = "https://www.funny.pl/images/items/d7a84628c025d30f7b2c52c958767e76.jpg";
        UserBuilder userBuilder = new UserBuilder(randomUserService);

        // when
        userBuilder.createUser(email, username, avatar);

        // then
        Mockito.verify(randomUserService, Mockito.never()).fetchRandomUser();
        Mockito.verifyNoInteractions(randomUserService);
    }

}