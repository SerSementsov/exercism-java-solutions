package main.java;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PangramChecker {

    private static final int ENGLISH_ALPHABET_SIZE = 26;

    public boolean isPangram(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        } else {
            Set<String> distinctLetters = Stream.of(input.toLowerCase().split(""))
                    .filter(s -> s.matches("[a-zA-Z]+"))
                    .collect(Collectors.toSet());

            return distinctLetters.size() == ENGLISH_ALPHABET_SIZE;

        }
    }

}
