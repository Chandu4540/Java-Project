package com.example.SBProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SBProject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{

}
