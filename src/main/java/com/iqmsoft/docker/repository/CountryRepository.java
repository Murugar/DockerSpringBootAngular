package com.iqmsoft.docker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.iqmsoft.docker.model.Country;

@RepositoryRestResource(collectionResourceRel = "all", path = "country")
public interface CountryRepository extends CrudRepository<Country, String> {

}
