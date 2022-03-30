package com.mwcc.mwccmanager.PayPeriod;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pay_period")
public class PayPeriod {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "start", nullable = false)
    private LocalDateTime start;
    @Column(name = "end", nullable = false)
    private LocalDateTime end;

    public PayPeriod() {
    }


    public PayPeriod(Long id, LocalDateTime start, LocalDateTime end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
