package com.iqmsoft.docker.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.iqmsoft.docker.model.City;
import com.iqmsoft.docker.model.Country;

@Configuration
public class RepositoryConfiguration extends RepositoryRestMvcConfiguration {
    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	config.exposeIdsFor(City.class, Country.class);
	config.setBasePath("/rest");

    }
}
