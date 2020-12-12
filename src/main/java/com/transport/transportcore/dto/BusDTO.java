package com.transport.transportcore.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BusDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String plateNum;
	private double longitude;
	private double latitude;
	private int occupency;
	private int totalCapacity;
	private float fuelConsumptionPerKM;
	private List<IncidentMonitoringDTO> incidentDTO;
	public String getPlateNum() {
		return plateNum;
	}
	public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public int getOccupency() {
		return occupency;
	}
	public void setOccupency(int occupency) {
		this.occupency = occupency;
	}
	public int getTotalCapacity() {
		return totalCapacity;
	}
	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}
	public float getFuelConsumptionPerKM() {
		return fuelConsumptionPerKM;
	}
	public void setFuelConsumptionPerKM(float fuelConsumptionPerKM) {
		this.fuelConsumptionPerKM = fuelConsumptionPerKM;
	}
	public List<IncidentMonitoringDTO> getIncidentDTO() {
		return incidentDTO;
	}
	public void setIncidentDTO(List<IncidentMonitoringDTO> incidentDTO) {
		this.incidentDTO = incidentDTO;
	}
	
	

}
