package pl.javastart.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

public class BaseTest {
    private AutoCloseable closeable;

    @BeforeEach
    final void setupMocks() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void cleanup() throws Exception {
        closeable.close();
    }
}
