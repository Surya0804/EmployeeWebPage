package com.example.employeewebpage.employeewebpage.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeewebpage.employeewebpage.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
   

}


