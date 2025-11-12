package com.example.JPA.Relationships.and.Inheritance.Models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "association")
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "division_id", fetch = FetchType.EAGER)
    private Set<Division> divisions;

    public Association() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Division> getDivisions() {
        return divisions;
    }
}
