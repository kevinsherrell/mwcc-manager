//package com.mwcc.mwccmanager.Entry;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@RequestMapping(path="/api/entry")
//public class EntryController {
//    @Autowired
//    private EntryService entryService;
//
//    @PostMapping("/add")
//    public ResponseEntity<?> addNewEntry(@RequestBody Entry entry) throws Exception{
//        entry.setId(0L);
//        entryService.saveOrUpdateEntry(entry);
//        return new ResponseEntity<>(entry, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<?> updateEntry(@PathVariable Long id, @RequestBody Entry entry) throws Exception{
//        entry.setId(id);
//        entryService.saveOrUpdateEntry(entry);
//        return new ResponseEntity<>(entry, HttpStatus.CREATED);
//    }
//
//    @GetMapping("/all")
//    public ResponseEntity<?> getAllEntries() throws Exception{
//        return new ResponseEntity<>(entryService.getAll(), HttpStatus.ACCEPTED);
//    }
//
//    @GetMapping("/all/employe/{employeeId}")
//    public ResponseEntity<?> getAllByEmployeeId(@PathVariable Long employeeId){
//        return new ResponseEntity<>(entryService.getAllByEmployeeId(employeeId), HttpStatus.CREATED);
//    }
//
//    @GetMapping("/all/timesheet/{timesheetId}")
//    public ResponseEntity<?> getAllByTimesheetId(@PathVariable Long timesheetId){
//        return new ResponseEntity<>(entryService.getAllByTimesheetId(timesheetId), HttpStatus.CREATED);
//    }
//    @GetMapping("/id/{id}")
//    public ResponseEntity<?> getEntryById(@PathVariable Long id){
//        return new ResponseEntity<>(entryService.getById(id), HttpStatus.ACCEPTED);
//    }

//}
