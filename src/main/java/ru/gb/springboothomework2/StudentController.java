package ru.gb.springboothomework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    StudentRepository repository;

    @Autowired
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("all")
    public List<Student> getAll() {
        return repository.getAll();
    }

    @GetMapping("{id}")
    public Student getById(@PathVariable long id) {
        return repository.getById(id);
    }

    @GetMapping("search")
    public Student getByName(String name) {
        return repository.getByName(name);
    }
}
