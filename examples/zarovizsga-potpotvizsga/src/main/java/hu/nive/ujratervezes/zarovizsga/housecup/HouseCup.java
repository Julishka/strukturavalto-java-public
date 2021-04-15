package hu.nive.ujratervezes.zarovizsga.housecup;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class HouseCup {
    JdbcTemplate jdbcTemplate;

    public HouseCup(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Integer getPointsOfHouse(String house) {
        String sql = "SELECT SUM(points_earned) AS points_earned FROM house_points WHERE house_name = ?";
        return jdbcTemplate.queryForObject(sql, (resultSet, i) -> resultSet.getInt("points_earned"), house);
    }
}
