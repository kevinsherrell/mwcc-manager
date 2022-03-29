package com.mwcc.mwccmanager.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SickEntryService {
    @Autowired
    private SickEntryRepository sickEntryRepository;

    public SickEntry saveOrUpdateRegularEntry(SickEntry sickEntry) {
        return sickEntryRepository.save(sickEntry);
    }

    public Iterable<SickEntry> getAll() throws Exception {
        return sickEntryRepository.findAll();
    }

    public Iterable<SickEntry> getAllByTimesheetId(Long timesheetId) {
        return sickEntryRepository.findByTimesheetId(timesheetId);
    }

    public Iterable<SickEntry> getAllByEmployeeId(Long employeeId) {
        return sickEntryRepository.findByEmployeeId(employeeId);
    }
}
