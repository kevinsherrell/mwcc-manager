package com.mwcc.mwccmanager.Entry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "vacation_entry")
public class VacationEntry extends Entry {
    @Column(name = "date")
    private LocalDate date = LocalDate.now();
    @Column(name="total_hours")
    private Double totalHours = 0.0;

    public VacationEntry() {
        super();
    }


    public VacationEntry(Long employeeId, Long timesheetId, LocalDate date) {
        super(employeeId, timesheetId);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "VacationEntry{" +
                "date=" + date +
                '}';
    }

    public Double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Double totalHours) {
        this.totalHours = totalHours;
    }
}
