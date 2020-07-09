package com.anwesys.milestone3demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "French")
public class French implements Serializable {
    @Id
    @Getter
    @Setter
    @Column(name = "word", unique = true)
    private String word;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "german_word")
    @Getter
    @Setter
    private German german;
}
