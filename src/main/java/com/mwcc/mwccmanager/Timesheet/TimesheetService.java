package com.mwcc.mwccmanager.Timesheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TimesheetService {
    @Autowired
    private TimesheetRepository timesheetRepository;

    public Timesheet saveOrUpdateTimesheet(Timesheet timesheet) {
        return timesheetRepository.save(timesheet);
    }

    public Iterable<Timesheet> getAll() throws Exception {
        for (Timesheet tsheet : timesheetRepository.findAll()) {
            System.out.println(tsheet.getPeriodStart().atStartOfDay());
            System.out.println(tsheet.getPeriodEnd().getClass());
        }
        return timesheetRepository.findAll();
    }
public Iterable<Timesheet> getAllByEmployeeId(Long employeeId){
    return timesheetRepository.findAllByEmployeeId(employeeId);
}
public Optional<Timesheet> getById(Long id){
    return timesheetRepository.findById(id);
}


}
