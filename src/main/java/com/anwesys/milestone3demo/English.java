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
    private String word;
	
    @OneToOne(mappedBy ="translation")
    @Getter
    @Setter
    private German translation;
}
