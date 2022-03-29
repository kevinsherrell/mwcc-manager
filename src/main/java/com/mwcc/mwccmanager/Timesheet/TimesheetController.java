package com.mwcc.mwccmanager.Timesheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api/timesheet")
public class TimesheetController {
    @Autowired
    private TimesheetService timesheetService;

    @PostMapping("/add")
    public ResponseEntity<?> addNewTimesheet(@RequestBody Timesheet timesheet) {
        timesheet.setId(0L);
        timesheetService.saveOrUpdateTimesheet(timesheet);
        return new ResponseEntity<>(timesheet, HttpStatus.CREATED);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<?> updateTimesheet(@PathVariable Long id, @RequestBody Timesheet timesheet) {
        timesheet.setId(id);
        timesheetService.saveOrUpdateTimesheet(timesheet);
        return new ResponseEntity<>(timesheet, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllTimesheets() throws Exception {
        return new ResponseEntity<>(timesheetService.getAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("all/employeeId/{employeeId}")
    public ResponseEntity<?> getByEmployeeId(@PathVariable Long employeeId) {
        return new ResponseEntity<>(timesheetService.getAllByEmployeeId(employeeId), HttpStatus.ACCEPTED);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<?> getTimeshetById(@PathVariable Long id) {
        return new ResponseEntity<>(timesheetService.getById(id), HttpStatus.ACCEPTED);
    }

}
