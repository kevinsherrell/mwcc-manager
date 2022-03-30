package com.mwcc.mwccmanager.Entry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "regular_entry")
public class RegularEntry extends Entry {
    @Column(name = "time_in")
    private Timestamp in;
    @Column(name = "time_out")
    private Timestamp out;
    @Column(name = "total_hours")
    private Double totalHours = 0.0;

    public RegularEntry() {
        super();
    }


    public RegularEntry(Long employeeId, Long timesheetId, Timestamp in, Timestamp out) {
        super(employeeId, timesheetId);
        this.in = in;
        this.out = out;
    }

    public Timestamp getIn() {
        return in;
    }

    public void setIn(Timestamp in) {
        this.in = in;
    }

    public Timestamp getOut() {
        return out;
    }

    public void setOut(Timestamp out) {
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
