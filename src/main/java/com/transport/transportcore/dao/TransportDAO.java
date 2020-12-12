package com.transport.transportcore.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.transport.transportcore.dto.BusDTO;
import com.transport.transportcore.exceptions.BusNotFoundException;
@Service
public interface TransportDAO {
	public abstract List<BusDTO> displayBussesLocation();
	public abstract Map<String,BusDTO> getBusCapacityAndAccupency(String numPlate) throws BusNotFoundException;
}
