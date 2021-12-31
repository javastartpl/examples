import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

class DataGenerator {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("pl-PL"));
        //10 losowych imion i nazwisk
        Name name = faker.name();
        System.out.println("Losowe imiona i nazwiska:");
        final int randomDataSize = 10;
        for (int i = 0; i < randomDataSize; i++) {
            System.out.println("Imię: " + name.firstName());
            System.out.println("Nazwisko: " + name.lastName());
        }

        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("pl-PL"), new RandomService());
        //ciąg 5 losowych znaków
        String fiveLetterRandom = fakeValuesService.letterify("?????", true);
        System.out.println(fiveLetterRandom);
        //ciąg 10 losowych znaków i cyfr występujących naprzemiennie
        String randomLettersDigits = fakeValuesService.bothify("?#?#?#?#?#");
        System.out.println(randomLettersDigits);

        //Domena https://imienazwisko.pl
        String url = fakeValuesService.expression("https://#{Name.firstName}#{Name.lastName}.pl", faker);
        System.out.println(fiveLetterRandom);

    }
}
