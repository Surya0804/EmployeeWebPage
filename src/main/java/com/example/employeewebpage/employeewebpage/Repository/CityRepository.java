package com.example.employeewebpage.employeewebpage.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.employeewebpage.employeewebpage.Entity.City;

public interface CityRepository extends JpaRepository<City,Integer> {
    
    @Query(value = "select * from city_table",nativeQuery = true)
    public List<City> getAllCities();
    
}
