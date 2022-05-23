package com.example.Employees.employees;

import javax.persistence.*;

@Entity
@Table

public class Employees {
    @Id
    @SequenceGenerator(
            name = "sequences",
            sequenceName =  "sequences",
            allocationSize = 10
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequences")

    private  Long id;

    private  String name;
    private String email;

    private  Integer staffNumber;

    public Employees(Long id, String name, String email, Integer staffNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.staffNumber = staffNumber;
    }

    public Employees() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }
}
