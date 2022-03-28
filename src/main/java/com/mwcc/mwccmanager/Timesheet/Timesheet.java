package com.mwcc.mwccmanager.Timesheet;

import com.mwcc.mwccmanager.Entry.Entry;

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
    @Column(name = "entry_id", nullable = false)
    private Long entryId;
    @Column(name = "period_start", nullable = false)
    private LocalDate periodStart;
    @Column(name = "period_end", nullable = false)
    private LocalDate periodEnd;
    @Column(name = "commission", nullable = false)
    private double commission;
    @Column(name = "uhaul", nullable = false)
    private double uhaul;
    @Column(name = "spiff", nullable = false)
    private double spiff;
    @Column(name = "special", nullable = false)
    private double special;
    @Column(name = "special_2", nullable = false)
    private double special2;

    @OneToMany(fetch = FetchType.EAGER, targetEntity = Entry.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "entryId", referencedColumnName = "id", insertable = false, updatable = false)
    private List<Entry> entries;

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

    public Long getEntryId() {
        return entryId;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
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

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
