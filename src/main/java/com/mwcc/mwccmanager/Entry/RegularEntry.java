package com.mwcc.mwccmanager.Entry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "regular_entry")
public class RegularEntry extends Entry {
    @Column(name = "time_in")
    private LocalDateTime in;
    @Column(name = "time_out")
    private LocalDateTime out;
    @Column(name = "total_hours")
    private Double totalHours = 0.0;

    public RegularEntry() {
        super();
    }


    public RegularEntry(Long employeeId, Long timesheetId, LocalDateTime in, LocalDateTime out) {
        super(employeeId, timesheetId);
        this.in = in;
        this.out = out;
    }

    public LocalDateTime getIn() {
        return in;
    }

    public void setIn(LocalDateTime in) {
        this.in = in;
    }

    public LocalDateTime getOut() {
        return out;
    }

    public void setOut(LocalDateTime out) {
        this.out = out;
    }

    @Override
    public String toString() {
        return "RegularEntry{" +
                "in=" + in +
                ", out=" + out +
                '}';
    }

    public Double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Double totalHours) {
        this.totalHours = totalHours;
    }
}
