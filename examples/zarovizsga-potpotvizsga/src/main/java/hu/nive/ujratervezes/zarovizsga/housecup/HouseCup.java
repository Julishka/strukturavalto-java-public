package hu.nive.ujratervezes.zarovizsga.housecup;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class HouseCup {
    JdbcTemplate jdbcTemplate;

    public HouseCup(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getPointsOfHouse(String house) {
        //TODO
        return 0;
    }
}
