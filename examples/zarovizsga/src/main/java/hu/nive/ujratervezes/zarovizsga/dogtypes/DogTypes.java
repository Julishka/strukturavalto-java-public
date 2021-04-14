package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class DogTypes {
    JdbcTemplate jdbcTemplate;

    public DogTypes(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> getDogsByCountry(String country) {
        String sql = "SELECT lower(name) as name FROM dog_types WHERE lower(country) = ? ORDER BY name";
        return jdbcTemplate.query(sql, (resultSet, i) -> resultSet.getString("name"), country);

        /*return jdbcTemplate.query("SELECT lower(NAME) as name FROM dog_types WHERE lower(country) = lower(?) ORDER BY NAME",
                (resultSet, i) -> resultSet.getString("name"),
                country);*/
    }
}
