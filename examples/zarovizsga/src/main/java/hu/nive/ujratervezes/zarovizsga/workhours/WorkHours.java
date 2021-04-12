package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class WorkHours {
    public String minWork(String file) {

        Objects.requireNonNull(file);
        if (file.isEmpty()) {
            throw new UnsupportedOperationException("File name is empty.");
        }
        Path path = Paths.get(file);

        try {
            List<String> lines = Files.readAllLines(path);
            int workingHours = Integer.parseInt(lines.get(0).split(",")[1]);
            for (String line : lines) {
                String[] split = line.split(",");
                Integer currentWorkingHour = Integer.valueOf(split[1]);
                if (currentWorkingHour < workingHours) {
                    workingHours = currentWorkingHour;
                }
            }

            for (String line : lines) {
                String[] split = line.split(",");
                int currentWorkingHour = Integer.parseInt(split[1]);
                if (currentWorkingHour == workingHours) {
                    return split[0] + ": " + split[2];
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
