package com.anwesys.milestone3demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "frenchDictionary", path = "fr")
public interface FrenchRepository extends CrudRepository<French, Long> {
}
