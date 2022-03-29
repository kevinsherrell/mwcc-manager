package com.mwcc.mwccmanager.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/sick-entry")
public class SickEntryController {
    @Autowired
    public SickEntryService sickEntryService;

    @PostMapping("/add")
    public ResponseEntity<?> addNewSickEntry(@RequestBody SickEntry sickEntry) {
        sickEntry.setId(0L);
        sickEntryService.saveOrUpdateRegularEntry(sickEntry);
        return new ResponseEntity<>(sickEntry, HttpStatus.CREATED);
    }
}
