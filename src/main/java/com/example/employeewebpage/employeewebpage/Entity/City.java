package com.example.employeewebpage.employeewebpage.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city_table")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String city;
    @Column
    private int state_id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getState_id() {
        return this.state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public City(int id, String city, int state_id) {
        this.id = id;
        this.city = city;
        this.state_id = state_id;
    }

    public City() {
    }


}
