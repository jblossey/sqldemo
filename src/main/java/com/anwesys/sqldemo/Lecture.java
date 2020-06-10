package com.anwesys.sqldemo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
public class Lecture implements Serializable {
    @Id
    @Getter
    private int lectureId;

    @Getter
    @Setter
    private String name;

    @ManyToMany
    @Getter
    private List<Student> students;
}
