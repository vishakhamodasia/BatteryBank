package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Battery;
import com.example.service.BatteryService;

@RestController
public class BatteryRestController {
	
	@Autowired
	private BatteryService batteryService;
	
	@RequestMapping(path="/battery", method=RequestMethod.GET)
	public List<Battery> getAllBatteries(){
		return batteryService.getAllBatteries();
	}
    @RequestMapping(value = "/battery/{id}", method = RequestMethod.GET)
	public Battery getBatteryById(@PathVariable("id") long id){
		return batteryService.getBatteryById(id);
	}

}
