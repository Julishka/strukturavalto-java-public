package hu.nive.ujratervezes.zarovizsga.peoplesql;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class PeopleDao {
    JdbcTemplate jdbcTemplate;
    DataSource dataSource;

    public PeopleDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        this.dataSource = dataSource;
    }

    public String findIpByName(String firstName, String lastName) {
        Object[] parameters = {firstName, lastName};
        String sql = "SELECT ip_address FROM people WHERE first_name = ? AND last_name = ?";

        return jdbcTemplate.query(sql, (resultSet, i) -> resultSet.getString("ip_address"), parameters).get(0);
    }
}
