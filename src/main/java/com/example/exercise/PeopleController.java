package com.example.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/formPeople")
    public String formInsert() {
        return "formPeople.html";
    }

    @RequestMapping("/formUpdatePeople")
    public String formUpdatePeople(@RequestParam("id"), Model model) {
        ClassPeople person = new ClassPeople(id);

        return "formUpdatePeople.html";
    }

    @RequestMapping("/insert")
    public String insert(ClassPeople person, Model model) {
        servicePeople.postPeople(person);
        model.addAttribute("list", servicePeople.getPeople());
        return "peopleList.html";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model) {

        ClassPeople person = new ClassPeople(id, null, null, 0);

        servicePeople.deletePeople(person);

        model.addAttribute("list", servicePeople.getPeople());

        return "peopleList.html";

    }

    @RequestMapping("/update")
    public String update(@RequestParam("id") int id, @RequestParam("name") String name,
            @RequestParam("lastName") String lastName, @RequestParam("age") int age, Model model) {

        ClassPeople person = new ClassPeople(id, name, lastName, age);

        servicePeople.deletePeople(person);

        model.addAttribute("list", servicePeople.getPeople());

        return "peopleList.html";
    }

}
