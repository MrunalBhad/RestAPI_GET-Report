package com.example.report;

import java.util.List;

//ReportResponse.java
public class ReportResponse {
 private String scanStartTime;
 private String scanEndTime;
 private String scanName;
 private String datastoreName;
 private List<DataItem> dataItems;
public String getScanStartTime() {
	return scanStartTime;
}
public void setScanStartTime(String scanStartTime) {
	this.scanStartTime = scanStartTime;
}
public String getScanEndTime() {
	return scanEndTime;
}
public void setScanEndTime(String scanEndTime) {
	this.scanEndTime = scanEndTime;
}
public String getScanName() {
	return scanName;
}
public void setScanName(String scanName) {
	this.scanName = scanName;
}
public String getDatastoreName() {
	return datastoreName;
}
public void setDatastoreName(String datastoreName) {
	this.datastoreName = datastoreName;
}
public List<DataItem> getDataItems() {
	return dataItems;
}
public void setDataItems(List<DataItem> dataItems) {
	this.dataItems = dataItems;
}

 // Getters and Setters
}
