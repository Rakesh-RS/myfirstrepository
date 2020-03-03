package com.cusat.smartbin.service;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SensorServiceImpl implements SensorService{

	@Override
	public void receiveDepth() {
		recieveSensorData();
	}

	@Scheduled(fixedDelay = 1000)
	public void scheduleFixedDelayTask() {
		recieveSensorData();
	}
	
	private void recieveSensorData() {
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity("http://192.168.1.12/toggle", String.class);
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		
	}

}
