package com.example.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PeopleController {
    private ServicePeople servicePeople;

    public PeopleController(ServicePeople servicePeople) {
        this.servicePeople = servicePeople;
    }

    @RequestMapping("/PeopleList")
    public String toList(Model model) {
        model.addAttribute("list", servicePeople.getPeople());
        return "peopleList";
    }
}
