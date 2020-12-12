package com.transport.transportcore.controller;


import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transport.transportcore.dto.BusDTO;
import com.transport.transportcore.exceptions.BusNotFoundException;
import com.transport.transportcore.service.TransportService;


/**
* 
* 
* @author  
* @version 1.1
* @since   12-12-2020
*/

@RestController
@RequestMapping(TransportController.BASE_URL)
class TransportController {
	private static final Logger log=LoggerFactory.getLogger(TransportController.class);
	
	static final String BASE_URL = "/api/v1/transport";
	
	@Autowired
	TransportService transportService;
	
	
	@GetMapping("/findAllBusses")
	public List<BusDTO> getAllBusses() {
		log.info(this.getClass().getSimpleName() + ":" + "getAllUsers() Called");
		return transportService.displayBussesLocation();
	}

	@GetMapping("/{numPlate}")
	public Map<String, BusDTO> getBus(@PathVariable String numPlate) throws BusNotFoundException {
		log.info(this.getClass().getSimpleName() + ":" + "getBus() Called");
		return transportService.getBusCapacityAndAccupency(numPlate);
	}

}
