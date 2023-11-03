package com.example.exercise;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import io.micrometer.common.lang.Nullable;

@Repository
public class ClassPersonRowMapper implements RowMapper<ClassPeople> {
    @Override
    @Nullable
    public ClassPeople mapRow(ResultSet rs, int row) throws SQLException {
        return new ClassPeople(rs.getInt("id"), rs.getString("name"), rs.getString("lastName"), rs.getInt("age"));
    }
} 