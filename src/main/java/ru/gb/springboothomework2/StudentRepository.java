package ru.gb.springboothomework2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentRepository {
    private final List<Student> list;

    public StudentRepository() {
        list = new ArrayList<>();
        list.add(new Student("Dmitry", "DevOps"));
        list.add(new Student("Katerina", "Tests"));
        list.add(new Student("Vlad", "Design"));
        list.add(new Student("Egor", "Tests"));
        list.add(new Student("Vladimir", "DevOps"));
        list.add(new Student("Svetlana", "Design"));
        list.add(new Student("Evgeny", "DevOps"));
        list.add(new Student("Maxim", "Tests"));
        list.add(new Student("Mihail", "Tests"));
        list.add(new Student("Marya", "Design"));
    }

    public List<Student> getAll() {
        return List.copyOf(list);
    }

    public Student getById(long id) {
        return list.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Student getByName(String name) {
        return list.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
