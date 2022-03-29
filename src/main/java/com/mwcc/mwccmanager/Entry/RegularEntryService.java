package com.mwcc.mwccmanager.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegularEntryService {
    @Autowired
    private RegularEntryRepository regularEntryRepository;

    public RegularEntry saveOrUpdateRegularEntry(RegularEntry regularEntry) {
        return regularEntryRepository.save(regularEntry);
    }

    public Iterable<RegularEntry> getAll() throws Exception {
        return regularEntryRepository.findAll();
    }

    public Iterable<RegularEntry> getAllByTimesheetId(Long timesheetId) {
        return regularEntryRepository.findByTimesheetId(timesheetId);
    }

    public Iterable<RegularEntry> getAllByEmployeeId(Long employeeId) {
        return regularEntryRepository.findByEmployeeId(employeeId);
    }
}
