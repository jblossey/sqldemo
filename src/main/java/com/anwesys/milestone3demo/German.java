package com.anwesys.milestone3demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "german")
public class German implements Serializable {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int germanId;

    @Getter
    @Setter
    private String word;

    @OneToOne
    @Getter
    @Setter
    private English translation;
}
