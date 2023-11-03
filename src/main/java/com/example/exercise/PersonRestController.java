package com.example.exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("api")
public class PersonRestController {

    ServicePeople servicePeople;

    public PersonRestController(ServicePeople servicePeople) {
        this.servicePeople = servicePeople;
    }

    @GetMapping("/PeopleList")
    public List<ClassPeople> getPeople() {
        return servicePeople.getPeople();
    }



}
