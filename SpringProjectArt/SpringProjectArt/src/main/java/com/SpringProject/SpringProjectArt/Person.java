package com.SpringProject.SpringProjectArt;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Person {
    @Id
    private String personalId;
    private String firstName;
    private String lastName;
    private int phoneNo;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Vehicles> vehOwned;

    public Person(String personalId, String firstName, String lastName, int phoneNo) {
        this.personalId = personalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
    }
}
