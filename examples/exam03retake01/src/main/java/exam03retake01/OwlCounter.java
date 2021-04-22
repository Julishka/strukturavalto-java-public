package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class OwlCounter {
    protected Map<String, Integer> owlsByCounty;

    public OwlCounter() {
        this.owlsByCounty = new HashMap<>();
    }

    public Map<String, Integer> readFromFile(BufferedReader reader) {
        Objects.requireNonNull(reader);


        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split("=");
                owlsByCounty.put(split[0], Integer.parseInt(split[1]));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }

        return owlsByCounty;
    }

    public Integer getNumberOfOwls(String county) {
        return owlsByCounty.get(county);
    }
}
