package com.example.JPA.Relationships.and.Inheritance.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "division")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member president;

    @OneToMany(mappedBy = "member_id", fetch = FetchType.EAGER)
    private List<Member> members;

    public Division() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public Member getPresident() {
        return president;
    }

    public List<Member> getMembers() {
        return members;
    }
}
