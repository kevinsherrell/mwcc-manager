package com.mwcc.mwccmanager.Entry;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VacationEntryRepository extends CrudRepository<VacationEntry, Long> {
    Iterable<VacationEntry> findAll();
    Iterable<VacationEntry> findByTimesheetId(Long timesheetId);
    Optional<VacationEntry> findById(Long id);
}
