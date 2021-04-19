package exam03retake02;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.text.Collator;
import java.util.*;

public class BalatonStorm {

    public List<String> getStationsInStorm(BufferedReader reader) {
        Objects.requireNonNull(reader);
        List<String> stationsInStorm = new ArrayList<>();
        Gson gson = new Gson();
        Station[] stations = gson.fromJson(reader, Station[].class);
        for (Station station : stations) {
            System.out.println(station);
            if (station.getLevel() == 3) {
                stationsInStorm.add(station.getAllomas());
            }
        }
        Collections.sort(stationsInStorm, Collator.getInstance(new Locale("hu", "HU")));
        return stationsInStorm;
    }
}
