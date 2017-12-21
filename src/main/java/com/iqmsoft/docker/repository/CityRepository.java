package com.iqmsoft.docker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.iqmsoft.docker.model.City;

@RepositoryRestResource(collectionResourceRel = "all", path = "city")
public interface CityRepository extends CrudRepository<City, String> {

}
