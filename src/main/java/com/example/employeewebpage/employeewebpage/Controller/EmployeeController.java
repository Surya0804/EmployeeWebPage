package com.example.employeewebpage.employeewebpage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeewebpage.employeewebpage.Entity.City;
import com.example.employeewebpage.employeewebpage.Entity.Employee;
import com.example.employeewebpage.employeewebpage.Entity.State;
import com.example.employeewebpage.employeewebpage.Service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class EmployeeController {
     @Autowired
    private EmployeeService employeeService;
    @PostMapping("/addemployee")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }
    
    @GetMapping("/getallstates")
    public List<State> getAllStates()
    {
        return employeeService.getAllStates();
    }
   
    @GetMapping("/getallcities")
    public List<City> getAllCities()
    {
        return employeeService.getAllCities();
    }

}
