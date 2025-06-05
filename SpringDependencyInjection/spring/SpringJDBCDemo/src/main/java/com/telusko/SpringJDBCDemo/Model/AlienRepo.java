package com.telusko.SpringJDBCDemo.Model;
import com.telusko.SpringJDBCDemo.Model.Alien;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Getter
@Repository
public class AlienRepo  {

    private JdbcTemplate template;

    @Autowired

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void saveData(Alien alien){
        String sql= "INSERT INTO alien (id, age, name) VALUES (?, ?, ?)";
       int rows= template.update(sql, alien.getId(),alien.getAge(),alien.getName());
        System.out.println(rows + "rows affected");
    }

    public List<Alien> returnAll() {
        String sql = "select * from alien";
        RowMapper<Alien> mapper = new RowMapper<Alien>() {
            @Override
            public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
                Alien a = new Alien();
                a.setId(rs.getString(1));
                a.setAge(rs.getInt(2));
                a.setName(rs.getString(3));
                return a;
            }
        };

        List<Alien> aliens = template.query(sql, mapper);


        return aliens;
    }

    public int updateAlien(String id,Alien alien) {
        String sql = "UPDATE alien SET name = ?, age = ? WHERE id = ?";

        return template.update(sql,alien.getName(),alien.getAge(),alien.getId());
    }

    public void deleteAlien(String id){
        String sql= "DELETE FROM alien WHERE id = ? ";
        template.update(sql, id);
    }

}
