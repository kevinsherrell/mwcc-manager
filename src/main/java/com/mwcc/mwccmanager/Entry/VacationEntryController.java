package com.mwcc.mwccmanager.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/vacation-entry")
public class VacationEntryController {
    @Autowired
    public VacationEntryService vacationEntryService;

    @PostMapping("/add")
    public ResponseEntity<?> addNewVacationEntry(@RequestBody VacationEntry vacationEntry) {
        vacationEntry.setId(0L);
        vacationEntryService.saveOrUpdateVacationEntry(vacationEntry);
        return new ResponseEntity<>(vacationEntry, HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateVacationEntry(@PathVariable Long id, @RequestBody VacationEntry vacationEntry){
        vacationEntry.setId(id);
        vacationEntryService.saveOrUpdateVacationEntry(vacationEntry);
        return new ResponseEntity<>(vacationEntry, HttpStatus.CREATED);
    }
}
