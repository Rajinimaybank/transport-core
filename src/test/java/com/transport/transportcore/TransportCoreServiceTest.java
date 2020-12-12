package com.transport.transportcore;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.transport.transportcore.dao.TransportDAO;
import com.transport.transportcore.dto.BusDTO;
import com.transport.transportcore.dto.IncidentMonitoringDTO;
import com.transport.transportcore.exceptions.BusNotFoundException;
import com.transport.transportcore.service.TransportService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TransportCoreServiceTest {
	   @Autowired
	   private TransportService transportService;
	   @MockBean
	   private TransportDAO transportDAO;

	   @Test
	   public void getBusList() {
	      Mockito.when(transportDAO.displayBussesLocation()).thenReturn(getBusDTO());
	      List<BusDTO> busList = transportService.displayBussesLocation();
	      assertTrue(busList.size()==getBusDTO().size());
	   }
	   
	   @Test
	   public void getBusCapacityAndAccupency() throws BusNotFoundException {
		   Map<String, BusDTO> result= new HashMap<String, BusDTO>();
		   result.put("KA51A3347", getBusDTO().get(2));
			Mockito.when(transportDAO.getBusCapacityAndAccupency("KA51A3347")).thenReturn(result);
			 Map<String,BusDTO> busList = transportService.getBusCapacityAndAccupency("KA51A3347");
		      assertTrue(busList.size()==1);
	
	     
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
			busDTO2.setPlateNum("KA51A3346");
			busDTO2.setFuelConsumptionPerKM(5.4f);
			busDTO2.setIncidentDTO(incidentList);
			busDTO2.setLatitude(345677.3456);
			busDTO2.setLongitude(34566.5433);
			busDTO2.setOccupency(45);
			busDTO2.setTotalCapacity(56);
			
			BusDTO busDTO3= new BusDTO();
			busDTO3.setPlateNum("KA51A3347");
			busDTO3.setFuelConsumptionPerKM(5.4f);
			busDTO3.setIncidentDTO(incidentList);
			busDTO3.setLatitude(345677.3456);
			busDTO3.setLongitude(34566.5433);
			busDTO3.setOccupency(45);
			busDTO3.setTotalCapacity(56);
			
			List<BusDTO> busList= new ArrayList<BusDTO>();
			busList.add(busDTO1);
			busList.add(busDTO2);
			busList.add(busDTO3);
			return busList;
		}

}
