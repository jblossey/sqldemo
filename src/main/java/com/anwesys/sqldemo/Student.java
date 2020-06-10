package com.anwesys.sqldemo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student")
public class Student implements Serializable {
    @Id
    @Setter
    @Getter
    @Column(name = "matrId", unique = true)
    private int matriculationIds;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "students")
    private List<Lecture> lectures;

    @Getter
    @Setter
    @Column(name = "Name")
    private String name;

    public Student () {
        lectures = new ArrayList<>();
    }

}
