package com.mwcc.mwccmanager.Timesheet;

import com.fasterxml.jackson.annotation.JsonFormat;
//import com.mwcc.mwccmanager.Entry.Entry;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "timesheet"
)
public class Timesheet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "period_start", nullable = false)
    private LocalDate periodStart;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "period_end")
    private LocalDate periodEnd;
    @Column(name = "commission")
    private double commission = 0.0;
    @Column(name = "uhaul")
    private double uhaul = 0.0;
    @Column(name = "spiff")
    private double spiff = 0.0;
    @Column(name = "special")
    private double special = 0.0;
    @Column(name = "special_2")
    private double special2 = 0.0;

//    @OneToMany(fetch = FetchType.EAGER, targetEntity = Entry.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "timesheet_id")
//    private List<Entry> entries;

    public Timesheet() {

    }

    public Timesheet(Long employeeId, LocalDate periodStart, LocalDate periodEnd) {
        this.employeeId = employeeId;
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
    }

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


    public LocalDate getPeriodStart() {
        return periodStart;
    }

    public void setPeriodStart(LocalDate periodStart) {
        this.periodStart = periodStart;
    }

    public LocalDate getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(LocalDate periodEnd) {
        this.periodEnd = periodEnd;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getUhaul() {
        return uhaul;
    }

    public void setUhaul(double uhaul) {
        this.uhaul = uhaul;
    }

    public double getSpiff() {
        return spiff;
    }

    public void setSpiff(double spiff) {
        this.spiff = spiff;
    }

    public double getSpecial() {
        return special;
    }

    public void setSpecial(double special) {
        this.special = special;
    }

    public double getSpecial2() {
        return special2;
    }

    public void setSpecial2(double special2) {
        this.special2 = special2;
    }

//    public List<Entry> getEntries() {
//        return entries;
//    }
//
//    public void setEntries(List<Entry> entries) {
//        this.entries = entries;
//    }


    @Override
    public String toString() {
        return "Timesheet{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", periodStart=" + periodStart +
                ", periodEnd=" + periodEnd +
                ", commission=" + commission +
                ", uhaul=" + uhaul +
                ", spiff=" + spiff +
                ", special=" + special +
                ", special2=" + special2 +
                '}';
    }
}
