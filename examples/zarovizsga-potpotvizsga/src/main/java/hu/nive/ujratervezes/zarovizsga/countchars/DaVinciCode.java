package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class DaVinciCode {
    public int encode(String path, char character) {
        Objects.requireNonNull(path);
        if (path.equals("")) {
            throw new IllegalArgumentException("Path cannot be empty");
        }
        if (character != '0' && character != '1' && character != 'x') {
            throw new IllegalArgumentException("Character shall be either 0, 1 or x");
        }
        Path filePath = Paths.get(path);
        int frequency = 0;
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                char[] chars = line.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == character) {
                        frequency++;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("File cannot be found on path " + path);
        }
        return frequency;
    }
}
