package com.mwcc.mwccmanager.Store;

import com.mwcc.mwccmanager.Employee.Employee;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<Store, Long> {
    Iterable<Store> findAll();
    Store findById(long id);
}
