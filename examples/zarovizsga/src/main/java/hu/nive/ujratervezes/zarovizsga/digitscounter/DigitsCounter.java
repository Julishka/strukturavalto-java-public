package hu.nive.ujratervezes.zarovizsga.digitscounter;

public class DigitsCounter {
    int getCountOfDigits(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String character = Character.toString(s.charAt(i));
            if (Character.isDigit(s.charAt(i)) && numbers.indexOf(character) == -1) {
                numbers.append(s.charAt(i));
            }
        }
        return numbers.length();
    }
}
