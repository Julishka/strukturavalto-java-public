package exam03retake01;

import java.util.Objects;

public class CdvCheck {
    public boolean check(String taxNumber) {
        Objects.requireNonNull(taxNumber);
        char[] numbers = taxNumber.toCharArray();
        if (numbers.length != 10) {
            throw new IllegalArgumentException("Number shall contain 10 digits.");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (!Character.isDigit(numbers[i])) {
                throw new IllegalArgumentException("Character shall be a digit.");
            }
            sum += Character.getNumericValue(numbers[i]) * (i + 1);
        }
        return sum % 11 == Character.getNumericValue(numbers[9]);
    }
}
