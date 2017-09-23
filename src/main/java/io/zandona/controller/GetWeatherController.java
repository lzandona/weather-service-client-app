package io.zandona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.zandona.repository.WeatherRepository;

@RestController
public class GetWeatherController {

	@Autowired
	private WeatherRepository repository;
	
	
	@GetMapping("/")
	public String getWeather() {
		return repository.getCurrentWeather();
	}
	
}
