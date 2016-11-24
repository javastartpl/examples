package pl.javastart;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import pl.javastart.model.Person;

public class ValidationExample {

    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        
        //brak nazwiska, błędny email i błędny wiek
        Person person = new Person("Jan", null, "zlyEmail", 0);
        Set<ConstraintViolation<Person>> errors = validator.validate(person);
        errors.forEach(error -> System.err.println(error.getPropertyPath() + " " + error.getMessage()));
    }
}
