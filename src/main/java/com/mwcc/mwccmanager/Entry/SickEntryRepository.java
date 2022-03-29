package com.mwcc.mwccmanager.Entry;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SickEntryRepository extends CrudRepository<SickEntry, Long> {
    Iterable<SickEntry> findAll();
    Iterable<SickEntry> findByTimesheetId(Long timesheetId);
    Optional<SickEntry> findById(Long id);
}
