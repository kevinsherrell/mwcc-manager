package com.mwcc.mwccmanager.Entry;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "entry")
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id", nullable = false)
    private Long id;
    @Column(name="employee_id", nullable = false)
    private Long employeeId;
    @Column(name="timesheet_id", nullable = false)
    private Long timesheetId;
    @Column(name="in", columnDefinition = "default null")
    private LocalDateTime in = null;
    @Column(name="out", columnDefinition = "default null")
    private LocalDateTime out = null;
    @Column(name="type", nullable = false)
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getTimesheetId() {
        return timesheetId;
    }

    public void setTimesheetId(Long timesheetId) {
        this.timesheetId = timesheetId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
