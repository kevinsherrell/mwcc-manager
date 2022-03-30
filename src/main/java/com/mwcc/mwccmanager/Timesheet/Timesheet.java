package com.mwcc.mwccmanager.Timesheet;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.mwcc.mwccmanager.Entry.RegularEntry;
import com.mwcc.mwccmanager.Entry.SickEntry;
import com.mwcc.mwccmanager.Entry.VacationEntry;
import com.mwcc.mwccmanager.PayPeriod.PayPeriod;
//import com.mwcc.mwccmanager.Entry.Entry;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    @Column(name = "period_id", nullable = false)
    private Long periodId;

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

    @OneToMany(fetch = FetchType.LAZY, targetEntity = RegularEntry.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "timesheet_id")
    private List<RegularEntry> regularEntries;
    @OneToMany(fetch = FetchType.LAZY, targetEntity = SickEntry.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "timesheet_id")
    private List<SickEntry> sickEntries;
    @OneToMany(fetch = FetchType.LAZY, targetEntity = VacationEntry.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "timesheet_id")
    private List<VacationEntry> vacationEntries;
    public Timesheet() {

    }

    public Timesheet(Long employeeId, Long periodId) {
        this.employeeId = employeeId;
        this.periodId = periodId;
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

    public Long getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Long periodId) {
        this.periodId = periodId;
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

    public List<RegularEntry> getRegularEntries() {
        return regularEntries;
    }

    public void setRegularEntries(List<RegularEntry> regularEntries) {
        this.regularEntries = regularEntries;
    }

    public List<SickEntry> getSickEntries() {
        return sickEntries;
    }

    public void setSickEntries(List<SickEntry> sickEntries) {
        this.sickEntries = sickEntries;
    }

    public List<VacationEntry> getVacationEntries() {
        return vacationEntries;
    }

    public void setVacationEntries(List<VacationEntry> vacationEntries) {
        this.vacationEntries = vacationEntries;
    }

    @Override
    public String toString() {
        return "Timesheet{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", commission=" + commission +
                ", uhaul=" + uhaul +
                ", spiff=" + spiff +
                ", special=" + special +
                ", special2=" + special2 +
                '}';
    }


}
