package com.transport.transportcore.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.transport.transportcore.dto.BusDTO;
import com.transport.transportcore.exceptions.BusNotFoundException;
/**
 * 
 * @author Rajini
 *
 */
@Service
public interface TransportService {
	public abstract List<BusDTO> displayBussesLocation();
	public abstract Map<String,BusDTO> getBusCapacityAndAccupency(String numPlate) throws BusNotFoundException;
}
