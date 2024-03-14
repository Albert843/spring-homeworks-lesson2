package ru.gb.springboothomework2;

import lombok.Data;

@Data
public class Student {
    private static long curId = 0;
    private final long id;
    private final String name;
    private final String groupName;

    public Student(String name, String groupName) {
        this.id = curId++;
        this.name = name;
        this.groupName = groupName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroupName() {
        return groupName;
    }
}
