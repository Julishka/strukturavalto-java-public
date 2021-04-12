package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {
    public DogTypes(DataSource dataSource) {
    }

    public List<String> getDogsByCountry(String country) {
        List<String> types = new ArrayList<>();

        return types;
    }
}
