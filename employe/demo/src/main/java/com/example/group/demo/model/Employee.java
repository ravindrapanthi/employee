package com.example.group.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {


    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;
    private String state;
    private String jobtype;
    private int salary;



    public Employee() {

    }



    public Employee(int id, String name, int age, String state, String jobtype, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.state = state;
        this.jobtype = jobtype;
        this.salary = salary;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public String getState() {
        return state;
    }



    public void setState(String state) {
        this.state = state;
    }



    public String getJobtype() {
        return jobtype;
    }



    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }



    public int getSalary() {
        return salary;
    }



    public void setSalary(int salary) {
        this.salary = salary;
    }


    
    



    

}
