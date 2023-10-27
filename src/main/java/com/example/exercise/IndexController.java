package com.example.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/Index")
    public String Index() {
        return "index";
    }

    @RequestMapping("/Empleado")
    public String Empleado() {
        return "empleado";
    }

    // @RequestMapping("/PeopleList")
    // public String PeopleList() {
    //     return "peopleList";
    // }
}
