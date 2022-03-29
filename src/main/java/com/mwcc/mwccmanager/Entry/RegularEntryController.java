package com.mwcc.mwccmanager.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/reg-entry")
public class RegularEntryController {
    @Autowired
    public RegularEntryService regularEntryService;

    @PostMapping("/add")
    public ResponseEntity<?> addNewReg(@RequestBody RegularEntry regularEntry) {
        regularEntry.setId(0L);
        regularEntryService.saveOrUpdateRegularEntry(regularEntry);
        return new ResponseEntity<>(regularEntry, HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateReg(@PathVariable Long id, @RequestBody RegularEntry regularEntry){
        regularEntry.setId(id);
        regularEntryService.saveOrUpdateRegularEntry(regularEntry);
        return new ResponseEntity<>(regularEntry, HttpStatus.CREATED);
    }
}
