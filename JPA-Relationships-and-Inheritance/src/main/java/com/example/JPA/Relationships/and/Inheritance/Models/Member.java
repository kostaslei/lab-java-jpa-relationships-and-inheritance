package com.example.JPA.Relationships.and.Inheritance.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;
    private LocalDate localDate;

    public Member() {}

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MemberStatus getStatus() {
        return status;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
