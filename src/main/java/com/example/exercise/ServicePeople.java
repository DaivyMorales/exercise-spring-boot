package com.example.exercise;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ServicePeople {

    public ClassPersonRepository personRepository;

    public ServicePeople(ClassPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<ClassPeople> getPeople() {
        return personRepository.showPeople();
    }

    // POST
    public void postPeople(ClassPeople person) {
        personRepository.insertPeople(person);
    }

    // DELETE
    public void deletePeople(ClassPeople person) {
        personRepository.deletePeople(person);
    }

    // DELETE
    public void updatePeople(ClassPeople person) {
        personRepository.updatePeople(person);
    }
}
