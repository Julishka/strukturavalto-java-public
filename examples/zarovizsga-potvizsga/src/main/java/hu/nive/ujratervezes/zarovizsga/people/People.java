package hu.nive.ujratervezes.zarovizsga.people;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class People {
    public int getNumberOfMales(String path) {
        Objects.requireNonNull(path);
        Path filePath = Paths.get(path);
        int males = 0;
        try {
            List<String> people = Files.readAllLines(filePath);
            for (String person : people) {
                String[] split = person.split(",");
                if (split[4].equals("Male")) {
                    males++;
                }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("File cannot be found on path " + path);
        }
        return males;
    }
}
