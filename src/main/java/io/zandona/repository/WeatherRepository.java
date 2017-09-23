package io.zandona.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class WeatherRepository {

	@Autowired
	private RestTemplate restTemplate;
	
	
	public String getCurrentWeather() {
		return restTemplate.getForEntity("http://weather-service/weather/current", String.class).getBody();
	}
	
}
