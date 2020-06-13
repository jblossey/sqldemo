package com.anwesys.milestone3demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "German")
public class German implements Serializable {

	@Id
    @Getter
    @Setter
    private String word;
	
	@OneToOne
	@JoinColumn(name = "english")
    @Getter
    @Setter
    private English translation;
}
