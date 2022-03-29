package com.mwcc.mwccmanager.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
