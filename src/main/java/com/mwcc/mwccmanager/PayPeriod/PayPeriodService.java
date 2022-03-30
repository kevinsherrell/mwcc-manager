package com.mwcc.mwccmanager.PayPeriod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PayPeriodService {
    @Autowired
    PayPeriodRepository payPeriodRepository;

    public Iterable<PayPeriod> getAll() throws Exception{
        return payPeriodRepository.findAll();
    }
    public Optional<PayPeriod> getById(Long id){
        return payPeriodRepository.findById(id);
    }
}
