package com.g2tech.test.demo1.controller;
import com.g2tech.test.demo1.domain.Person;
import com.g2tech.test.demo1.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ContactsController {
        @Autowired
        PersonRepository repository;

        @RequestMapping("/save")
        public String process() {
            repository.save(new Person("aaa", "111", "qwe@gmail.com"));
            return "Done";
        }




    }
