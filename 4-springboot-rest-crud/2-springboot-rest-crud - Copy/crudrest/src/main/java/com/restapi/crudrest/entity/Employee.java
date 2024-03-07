package com.restapi.crudrest.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
//import org.springframework.data.annotation.Id;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="employee_details", schema = "dbo")
public class Employee {


    /**********
     *
     * note that all the names of entity of class should start with lower case letter
     *
     *
     *
     *
     ***********/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private Integer id;

    @Column(name="employee_name")
    private String name;

    @Column(name="employee_salary")
    private double salary;

    public Employee(){

    }

    public Employee(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
