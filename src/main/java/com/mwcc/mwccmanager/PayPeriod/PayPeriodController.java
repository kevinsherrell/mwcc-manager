package com.mwcc.mwccmanager.PayPeriod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/pay-period")
public class PayPeriodController {
    @Autowired
    PayPeriodService payPeriodService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllPayPeriods() throws Exception {
        return new ResponseEntity<>(payPeriodService.getAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> getPayPeriodById(@PathVariable Long id) {
        return new ResponseEntity<>(payPeriodService.getById(id), HttpStatus.ACCEPTED);
    }
}
