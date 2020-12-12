package com.transport.transportcore.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.transport.transportcore.dao.TransportDAO;
import com.transport.transportcore.dto.BusDTO;
import com.transport.transportcore.exceptions.BusNotFoundException;

/**
*  
*  
* 
* @author  
* @version 1.1
* @since   12-12-2020
*/

@Service
public class TransportServiceImpl implements TransportService{
	@Autowired
	TransportDAO transportDAO;

	@Override
	public List<BusDTO> displayBussesLocation() {
		// TODO Auto-generated method stub
		return transportDAO.displayBussesLocation();
	}

	@Override
	public Map<String, BusDTO> getBusCapacityAndAccupency(String numPlate) throws BusNotFoundException {
		// TODO Auto-generated method stub
		return transportDAO.getBusCapacityAndAccupency(numPlate);
	}

}
