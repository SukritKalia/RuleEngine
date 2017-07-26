package com.sukrit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sukrit.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{

}
