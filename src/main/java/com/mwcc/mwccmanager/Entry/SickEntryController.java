package com.mwcc.mwccmanager.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/sick-entry")
public class SickEntryController {
    @Autowired
    public SickEntryService sickEntryService;

    @PostMapping("/add")
    public ResponseEntity<?> addNewSickEntry(@RequestBody SickEntry sickEntry) {
        sickEntry.setId(0L);
        sickEntryService.saveOrUpdateSickEntry(sickEntry);
        return new ResponseEntity<>(sickEntry, HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateSick(@PathVariable Long id, @RequestBody SickEntry sickEntry){
        sickEntry.setId(id);
        sickEntryService.saveOrUpdateSickEntry(sickEntry);
        return new ResponseEntity<>(sickEntry, HttpStatus.CREATED);
    }
}
