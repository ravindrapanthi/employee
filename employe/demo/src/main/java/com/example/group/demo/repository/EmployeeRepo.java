package com.example.group.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.group.demo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee , Integer> {



}
