package com.mwcc.mwccmanager.Entry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "sick_entry")
public class SickEntry extends Entry {
    @Column(name = "date")
    private LocalDateTime date = LocalDateTime.now();
    @Column(name="total_hours")
    private Double totalHours = 0.0;

    public SickEntry() {
        super();
    }


    public SickEntry(Long employeeId, Long timesheetId, LocalDateTime date) {
        super(employeeId, timesheetId);
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SickEntry{" +
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