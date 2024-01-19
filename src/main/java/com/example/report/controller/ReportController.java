package com.example.report.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.report.DataItem;
import com.example.report.ReportResponse;

//ReportController.java
@RestController
@RequestMapping("/reports")
public class ReportController {

 @GetMapping
 public ResponseEntity<List<ReportResponse>> getReports(@RequestParam(required = false) String scanName) {
     // Implement logic to retrieve reports based on the provided parameters
     // For simplicity, let's assume a static list of reports

     List<ReportResponse> reports = generateSampleReports();

     return ResponseEntity.ok(reports);
 }

 private List<ReportResponse> generateSampleReports() {
     // Generate sample reports for testing
     // You may replace this with actual data retrieval logic from a database
     List<ReportResponse> reports = new ArrayList<>();

     // Add sample report 1
     ReportResponse report1 = new ReportResponse();
     report1.setScanStartTime("2024-01-18T10:00:00");
     report1.setScanEndTime("2024-01-18T12:00:00");
     report1.setScanName("Scan-123");
     report1.setDatastoreName("Database-1");

     List<DataItem> dataItems1 = new ArrayList<>();
     dataItems1.add(new DataItem("Tile-1", "Details-1", "Type-1"));
     dataItems1.add(new DataItem("Tile-2", "Details-2", "Type-2"));

     report1.setDataItems(dataItems1);
     reports.add(report1);

     // Add sample report 2
     ReportResponse report2 = new ReportResponse();
     // ... (similar to report1)

     return reports;
 }
}

