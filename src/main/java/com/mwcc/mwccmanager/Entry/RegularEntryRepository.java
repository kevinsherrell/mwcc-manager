package com.mwcc.mwccmanager.Entry;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegularEntryRepository extends CrudRepository<RegularEntry, Long > {
    Iterable<RegularEntry> findAll();
    Iterable<RegularEntry> findByTimesheetId(Long timesheetId);
    Optional<RegularEntry> findById(Long id);
}
