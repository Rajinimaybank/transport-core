package com.transport.transportcore.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class IncidentMonitoringDTO implements Serializable{
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private String incidentNum;
private String status;
private Date incidentTime;
public String getIncidentNum() {
	return incidentNum;
}
public void setIncidentNum(String incidentNum) {
	this.incidentNum = incidentNum;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getIncidentTime() {
	return incidentTime;
}
public void setIncidentTime(Date incidentTime) {
	this.incidentTime = incidentTime;
}

}
