package exam03retake02;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BalatonStorm {

    public List<String> getStationsInStorm(BufferedReader reader) {
        JSONParser jsonParser = new JSONParser();
        List<String> stationsInStorm = new ArrayList<>();
        try {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                try {
                    JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
                    Integer id = (Integer) jsonObject.get("id");
                    String station = (String) jsonObject.get("allomas");
                    Double lat = (Double) jsonObject.get("lat");
                    Double lng = (Double) jsonObject.get("lng");
                    String description = (String) jsonObject.get("description");
                    Integer level = (Integer) jsonObject.get("level");
                    String groupId = (String) jsonObject.get("groupId");
                    String stationType = (String) jsonObject.get("stationType");

                    if (level == 3) {
                        stationsInStorm.add(station);
                    }
                    return stationsInStorm;
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return stationsInStorm;
    }
}
