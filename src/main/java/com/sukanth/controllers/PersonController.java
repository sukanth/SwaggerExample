package com.sukanth.controllers;

import com.sukanth.Beans.PersonBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    List<PersonBean> personBean = new ArrayList();

    @GetMapping(value = "/persons")
    public List<PersonBean> getAllPersons() {
        return personBean;
    }

    @PostMapping(value = "/persons")
    public PersonBean createPerson(@RequestParam String firstName,
                               @RequestParam String lastName,
                               @RequestParam String department,
                               @RequestParam int id) {
        PersonBean personBeanBuilder = PersonBean.builder().department(department)
                .firstName(firstName).lastName(lastName).id(id).build();
        personBean.add(personBeanBuilder);
        return personBeanBuilder;
    }
}
