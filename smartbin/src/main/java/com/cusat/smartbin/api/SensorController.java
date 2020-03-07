package com.cusat.smartbin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cusat.smartbin.service.SensorService;

@RestController
//@RequestMapping("api/sensor")
public class SensorController {
	
	@Autowired
	private SensorService sensorService;
	
	@Autowired
	private SimpMessagingTemplate templete;
	
	@GetMapping
	public String testSensor() {
		//System.out.println("Testttttttttt");
		 return sensorService.receiveDepth();
	}

	@MessageMapping("/send/message")
	public void onReceiveMessage(String message) {
		templete.convertAndSend("/enable-broker/updates", message);
	}
	
}
