package com.cusat.smartbin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SensorServiceImpl implements SensorService{

	@Autowired
	private SimpMessagingTemplate templete;
	
	@Override
	public String receiveDepth() {
		return recieveSensorData();
	}

	@Scheduled(fixedDelay = 1000)
	public void scheduleFixedDelayTask() {
		//recieveSensorData();
	}
	
	private String recieveSensorData() {
		
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity("http://192.168.43.199/toggle", String.class);
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		templete.convertAndSend("/enable-broker/updates",response.getBody()); 
		int levelOfBin=Integer.parseInt(response.getBody());
		int pecentOfBin=((levelOfBin)*100)/13;
		System.out.println(pecentOfBin);
		//return String.valueOf( pecentOfBin);
		return response.getBody();
		//return "";
		
	}

}
