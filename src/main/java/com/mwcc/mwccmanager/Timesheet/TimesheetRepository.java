package com.mwcc.mwccmanager.Timesheet;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
@Repository
public interface TimesheetRepository extends CrudRepository<Timesheet, Long> {
    Iterable<Timesheet> findAll();
    Iterable<Timesheet> findAllByEmployeeId(Long employeeId);
    Optional<Timesheet> findById(Long id);


}
