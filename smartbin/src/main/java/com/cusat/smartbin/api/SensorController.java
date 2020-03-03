package com.cusat.smartbin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cusat.smartbin.service.SensorService;

@RestController
@RequestMapping("api/sensor")
public class SensorController {
	
	@Autowired
	private SensorService sensorService;
	
	@GetMapping
	public void testSensor() {
		 sensorService.receiveDepth();
	}


}
