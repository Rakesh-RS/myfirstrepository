package com.cusat.smartbin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SensorServiceImpl implements SensorService{
	
	String sms="bin_1 is full . Location-> https://goo.gl/maps/Q3YAjzSmr7c54ns5A";
	boolean send=true;
	SmsSender smsSender;

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
	public boolean status=false;
	
	private String recieveSensorData() {
		
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity("http://192.168.43.199/toggle", String.class);
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		templete.convertAndSend("/enable-broker/updates",response.getBody()); 
		int levelOfBin=Integer.parseInt(response.getBody());
		int percentOfBin=((levelOfBin)*100)/50;
		System.out.println(percentOfBin);
		if(percentOfBin>80)
		{
			status=true;
		}
		else status=false;
		if(status && send)
		{
			//SmsSender.sendSMS(sms);
			send=false;
			
		}
		else send=true;
		System.out.println(status+" and "+send);
		//return String.valueOf( pecentOfBin);
		return response.getBody();
		//return "";
		
	}
	

}
