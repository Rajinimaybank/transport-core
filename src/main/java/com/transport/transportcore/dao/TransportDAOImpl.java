package com.transport.transportcore.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.transport.transportcore.dto.BusDTO;
import com.transport.transportcore.dto.IncidentMonitoringDTO;
import com.transport.transportcore.exceptions.BusNotFoundException;

@Component
public class TransportDAOImpl implements TransportDAO{

	@Override
	public List<BusDTO> displayBussesLocation() {
		// TODO Auto-generated method stub
		
		return getBusDTO();
	}

	@Override
	public Map<String, BusDTO> getBusCapacityAndAccupency(String numPlate) throws BusNotFoundException {
		// TODO Auto-generated method stub
		Map<String, BusDTO> result= new HashMap<>();
		List<BusDTO> list= getBusDTO();
		for(BusDTO busDTO:list) {
			String plateNum= busDTO.getPlateNum();
			if(StringUtils.isNoneEmpty(plateNum) && plateNum.equalsIgnoreCase(numPlate)) {
				result.put(numPlate, busDTO);
				return result;
			}else {
				throw new BusNotFoundException("Num plate is not Found");
			}
		}
		return null;
	}
	
	private List<BusDTO> getBusDTO() {
		IncidentMonitoringDTO incident1= new IncidentMonitoringDTO();
		incident1.setIncidentNum("001");
		incident1.setIncidentTime(new Date());
		incident1.setStatus("Inprogress");
		IncidentMonitoringDTO incident2= new IncidentMonitoringDTO();
		incident2.setIncidentNum("002");
		incident2.setIncidentTime(new Date());
		incident2.setStatus("Completed");
		IncidentMonitoringDTO incident3= new IncidentMonitoringDTO();
		incident3.setIncidentNum("003");
		incident3.setIncidentTime(new Date());
		incident3.setStatus("Completed");
		IncidentMonitoringDTO incident4= new IncidentMonitoringDTO();
		incident4.setIncidentNum("004");
		incident4.setIncidentTime(new Date());
		incident4.setStatus("Completed");
		IncidentMonitoringDTO incident5= new IncidentMonitoringDTO();
		incident5.setIncidentNum("005");
		incident5.setIncidentTime(new Date());
		incident5.setStatus("Completed");
		List<IncidentMonitoringDTO> incidentList= new ArrayList<IncidentMonitoringDTO>();
		incidentList.add(incident1);
		incidentList.add(incident2);
		incidentList.add(incident3);
		incidentList.add(incident4);
		incidentList.add(incident5);
		
		BusDTO busDTO1= new BusDTO();
		busDTO1.setPlateNum("KA51A3345");
		busDTO1.setFuelConsumptionPerKM(5.4f);
		busDTO1.setIncidentDTO(incidentList);
		busDTO1.setLatitude(345677.3456);
		busDTO1.setLongitude(34566.5433);
		busDTO1.setOccupency(45);
		busDTO1.setTotalCapacity(56);

		BusDTO busDTO2= new BusDTO();
		busDTO1.setPlateNum("KA51A3346");
		busDTO1.setFuelConsumptionPerKM(5.4f);
		busDTO1.setIncidentDTO(incidentList);
		busDTO1.setLatitude(345677.3456);
		busDTO1.setLongitude(34566.5433);
		busDTO1.setOccupency(45);
		busDTO1.setTotalCapacity(56);
		
		BusDTO busDTO3= new BusDTO();
		busDTO1.setPlateNum("KA51A3347");
		busDTO1.setFuelConsumptionPerKM(5.4f);
		busDTO1.setIncidentDTO(incidentList);
		busDTO1.setLatitude(345677.3456);
		busDTO1.setLongitude(34566.5433);
		busDTO1.setOccupency(45);
		busDTO1.setTotalCapacity(56);
		
		List<BusDTO> busList= new ArrayList<BusDTO>();
		busList.add(busDTO1);
		busList.add(busDTO2);
		busList.add(busDTO3);
		return busList;
	}

}
