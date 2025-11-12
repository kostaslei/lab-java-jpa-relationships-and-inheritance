package com.example.JPA.Relationships.and.Inheritance.Models;

import jakarta.persistence.*;

@Embeddable
@Table(name = "name")
public class Name {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String salutation;
    String firstName;
    String middleName;
    String lastName;

    public Name(){}

    public Long getId() {
        return id;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
}
