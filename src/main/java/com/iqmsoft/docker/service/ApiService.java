package com.iqmsoft.docker.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iqmsoft.docker.model.City;
import com.iqmsoft.docker.model.Country;

import com.iqmsoft.docker.repository.CityRepository;
import com.iqmsoft.docker.repository.CountryRepository;

@Component
public class ApiService {
	final static Logger logger = Logger.getLogger(ApiService.class);

	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private CountryRepository countryRepository;

	public void addCity(String cityName, String countryName, Long population) {
		City city = new City().setName(cityName).setPopulation(population);
		Country country = countryRepository.findOne(countryName);
		city.setCountry(country);
		country.addCity(city);
		cityRepository.save(city);

	}

	public void addCountry(String countryName) {
		Country country = new Country().setName(countryName);
		country = countryRepository.save(country);
	}



	@PostConstruct
	public void init() {
		logger.info("ApiService.init()");
		addCountry("USA");
		addCountry("RUSSIA");
		addCity("Los Angeles", "USA", 10000L);
		addCity("New York", "USA", 20000L);
		addCity("Washington", "USA", 30000L);
		addCity("Moscow", "RUSSIA", 90000L);
		addCity("Novosibirsk", "RUSSIA", 10000L);
	}
}
