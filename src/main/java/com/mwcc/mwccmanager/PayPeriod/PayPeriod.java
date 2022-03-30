package com.mwcc.mwccmanager.PayPeriod;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mwcc.mwccmanager.Timesheet.Timesheet;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pay_period")
public class PayPeriod {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "start", nullable = false)
    private LocalDateTime start;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "end", nullable = false)
    private LocalDateTime end;

    @OneToMany(fetch = FetchType.EAGER, targetEntity = Timesheet.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "period_id")
    private List<Timesheet> timesheets;

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

//    public List<Timesheet> getTimesheets() {
//        return timesheets;
//    }
//
//    public void setTimesheets(List<Timesheet> timesheets) {
//        this.timesheets = timesheets;
//    }
}
