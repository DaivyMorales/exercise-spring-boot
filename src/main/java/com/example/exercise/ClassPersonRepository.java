package com.example.exercise;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ClassPersonRepository {
    private JdbcTemplate tmpPerson;

    public ClassPersonRepository(JdbcTemplate tmpPerson) {
        this.tmpPerson = tmpPerson;
    }

    public List<ClassPeople> showPeople() {
        return tmpPerson.query("SELECT * FROM person", new ClassPersonRowMapper());
    }
    
    public void insertPeople(ClassPeople person) {
        tmpPerson.update("INSERT INTO person (id, name, lastName, age) values (?,?,?,?)", person.getId(),
        person.getName(),
        person.getLastName(), person.getAge());
    }
    
    @Transactional
    public void deletePeople(ClassPeople person) {
        tmpPerson.update("DELETE FROM person WHERE id = ?", person.getId());
    }
    
    @Transactional
    public void updatePeople(ClassPeople person) {
        tmpPerson.update("UPDATE person SET (name = ?, lastName = ?, age = ?) WHERE id = ?",
        person.getName(),
        person.getLastName(), person.getAge(), person.getId());
    }

    public List<ClassPeople> formUpdatePeople(ClassPeople person) {
        return tmpPerson.query("SELECT * FROM person", new ClassPersonRowMapper());
    }

    
}
