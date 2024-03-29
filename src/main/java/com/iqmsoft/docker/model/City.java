package com.iqmsoft.docker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class City implements Serializable {

    private static final long serialVersionUID = 3977347517121289291L;

    @Id
    private String name;

    @Column(nullable = false)
    private Long population;

    @ManyToOne
    private Country country;

    public String getName() {
	return name;
    }

    public City setName(String name) {
	this.name = name;
	return this;
    }

    public Long getPopulation() {
	return population;
    }

    public City setPopulation(Long population) {
	this.population = population;
	return this;
    }

    public Country getCountry() {
	return country;
    }

    public City setCountry(Country country) {
	this.country = country;
	return this;
    }

}
