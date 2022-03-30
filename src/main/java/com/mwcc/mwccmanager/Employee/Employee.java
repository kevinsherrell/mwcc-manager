package com.mwcc.mwccmanager.Employee;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mwcc.mwccmanager.Store.Store;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @Column(name="id", nullable = false)
    private Long id;

    @Column(name = "store_id", nullable = false, insertable = true, updatable = true)
    private Long storeId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "access_level", nullable = false)
    private String accessLevel;

    @Column(name = "sales_hourly", nullable = false)
    private Double hourlyRateSales;

    @Column(name = "hourly_guarantee", nullable = false)
    private Double hourlyRateGuarantee;

    @Column(name = "uhaul_rate", nullable = false)
    private Double uhaulRate;

    @Column(name = "vacation_days", nullable = false)
    private int vacationDays;

    @Column(name = "sick_days", nullable = false)
    private int sickDays;


    @OneToOne(fetch = FetchType.EAGER, targetEntity = Store.class, cascade = CascadeType.ALL)
    @JoinColumn(name="store_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Store homeStore;



//    @Temporal(TemporalType.DATE)
//    @Column(name="date_created", nullable = false)
//    private Date dateCreated = new Date();
//    @Temporal(TemporalType.DATE)
//    @Column(name="date_updated", nullable = false)
//    private Date dateUpdated = new Date();
    protected Employee() {
    }

    public Employee(Long storeId, String firstName, String lastName, String email, String password, String role, String accessLevel, Double hourlyRateSales, Double hourlyRateGuarantee, int vacationDays, int sickDays) {
//        this.id = id;
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.accessLevel = accessLevel;
        this.hourlyRateSales = hourlyRateSales;
        this.hourlyRateGuarantee = hourlyRateGuarantee;
        this.vacationDays = vacationDays;
        this.sickDays = sickDays;
    }


    @Override
    public String toString() {
        return "Employee{" +
//                "id=" + id +
                ", storeId=" + storeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", accessLevel='" + accessLevel + '\'' +
                ", hourlyRateSales=" + hourlyRateSales +
                ", hourlyRateGuarantee=" + hourlyRateGuarantee +
                ", vacationDays=" + vacationDays +
                ", sickDays=" + sickDays +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Double getHourlyRateSales() {
        return hourlyRateSales;
    }

    public void setHourlyRateSales(Double hourlyRateSales) {
        this.hourlyRateSales = hourlyRateSales;
    }

    public Double getHourlyRateGuarantee() {
        return hourlyRateGuarantee;
    }

    public void setHourlyRateGuarantee(Double hourlyRateGuarantee) {
        this.hourlyRateGuarantee = hourlyRateGuarantee;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getSickDays() {
        return sickDays;
    }

    public void setSickDays(int sickDays) {
        this.sickDays = sickDays;
    }

    public Store getHomeStore() {
        return homeStore;
    }

    public void setHomeStore(Store homeStore) {
        this.homeStore = homeStore;
    }
}
