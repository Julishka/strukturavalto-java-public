package hu.nive.ujratervezes.zarovizsga.words;

import java.util.Objects;

public class Words {
    public boolean hasMoreDigits(String s) {
        Objects.requireNonNull(s);
        int numberOfDigit = 0;
        int numberOfNonDigit = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                numberOfDigit++;
            } else {
                numberOfNonDigit++;
            }
        }

        return numberOfDigit > numberOfNonDigit;
    }
}
