package com.example.exercise;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ServicePeople {
    static List<ClassPeople> people = new ArrayList<ClassPeople>();

    static {
        ClassPeople p1 = new ClassPeople("Daivy", "Morales", 18);
        ClassPeople p2 = new ClassPeople("Juan", "Garzon", 19);

        people.add(p1);
        people.add(p2);
    }

    public List<ClassPeople> getPeople() {
        return people;
    }
}
