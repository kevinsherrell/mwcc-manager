package com.mwcc.mwccmanager.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacationEntryService {
    @Autowired
    private VacationEntryRepository vacationEntryRepository;

    public VacationEntry saveOrUpdateVacationEntry(VacationEntry vacationEntry) {
        return vacationEntryRepository.save(vacationEntry);
    }

    public Iterable<VacationEntry> getAll() throws Exception {
        return vacationEntryRepository.findAll();
    }

    public Iterable<VacationEntry> getAllByTimesheetId(Long timesheetId) {
        return vacationEntryRepository.findByTimesheetId(timesheetId);
    }

    public Iterable<VacationEntry> getAllByEmployeeId(Long employeeId) {
        return vacationEntryRepository.findByEmployeeId(employeeId);
    }
}
