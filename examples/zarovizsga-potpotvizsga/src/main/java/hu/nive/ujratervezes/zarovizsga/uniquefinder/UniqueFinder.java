package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;


public class UniqueFinder {
    public List<Character> uniqueChars(String string) {
        if (string == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        char[] charArray = string.toCharArray();
        List<Character> characters = new ArrayList<>();
        for (char character : charArray) {
            if (!characters.contains(character)) {
                characters.add(character);
            }
        }
        return characters;
    }
}
