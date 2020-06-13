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
	@Column(name = "word", unique = true)
    private String word;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "german")
    @Getter
    @Setter
    private List<English> english;
}
