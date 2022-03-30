package com.mwcc.mwccmanager.PayPeriod;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PayPeriodRepository extends CrudRepository<PayPeriod, Long> {
    Iterable<PayPeriod> findAll();
    Optional<PayPeriod> findById(Long id);
}
