package exam03retake02;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalatonStormTest {

    @Test
    void testGetStationsInStorm() throws IOException {
        List<String> stations = new ArrayList<>();
        stations.add("Ábrahámhegy");
        stations.add("Balatonfüred");
        stations.add("Balatonszárszó");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(BalatonStormTest.class.getResourceAsStream("storm.json")))) {
            assertEquals(stations, new BalatonStorm().getStationsInStorm(reader));
        }
    }
}
