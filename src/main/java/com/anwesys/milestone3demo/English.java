package com.anwesys.milestone3demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "English")
public class English implements Serializable {
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
