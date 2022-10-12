package pl.javastart.example.junits;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RandomUserService {

    private static final String RANDOM_USER_URL = "https://random-data-api.com/api/users/random_user";

    public pl.javastart.example.junits.RandomUserDto fetchRandomUser() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(RANDOM_USER_URL))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            String body = response.body();
            return gson.fromJson(body, pl.javastart.example.junits.RandomUserDto.class);
        } catch (Exception e) {
            throw new RuntimeException("Coś poszło nie tak", e);
        }
    }
}
