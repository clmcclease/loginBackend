package dev.mcclease.loginbackend.registration;

import java.util.function.Predicate;

public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        //make a regex to validate.
        return true;
    }
}
