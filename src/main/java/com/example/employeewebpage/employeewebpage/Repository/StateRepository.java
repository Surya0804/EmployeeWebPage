package com.example.employeewebpage.employeewebpage.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.employeewebpage.employeewebpage.Entity.State;

public interface StateRepository extends JpaRepository<State,Integer> {

     @Query(value = "SELECT * FROM state_table",nativeQuery = true)
    public List<State> getAllStates();
    
    @Query(value = "select name from state_table where id=?",nativeQuery = true)
    public String getStateNameById(String id);

}
