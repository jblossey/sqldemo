package com.anwesys.milestone3demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "german", path = "german")
public interface GermanRepository extends CrudRepository<German, Long> {

}