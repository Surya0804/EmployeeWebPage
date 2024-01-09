package com.example.employeewebpage.employeewebpage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.employeewebpage.employeewebpage.Entity.City;
import com.example.employeewebpage.employeewebpage.Entity.Employee;
import com.example.employeewebpage.employeewebpage.Entity.State;
import com.example.employeewebpage.employeewebpage.Repository.CityRepository;
import com.example.employeewebpage.employeewebpage.Repository.EmployeeRepository;
import com.example.employeewebpage.employeewebpage.Repository.StateRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private StateRepository stateRepository;
    @Autowired
    private CityRepository cityRepository;
    //add employee data to db
    public ResponseEntity<String> addEmployee(Employee employee)
    {
        String statename=stateRepository.getStateNameById(employee.getState());
        employee.setState(statename);
        employeeRepository.save(employee);
        return ResponseEntity.ok().body("Employee Added Successfully");
    }

    //get all states
    public List<State> getAllStates()
    {
        return stateRepository.getAllStates();
    }

    //get all cities
    public List<City> getAllCities()
    {
        return cityRepository.getAllCities();
    }
}
