package com.example.JPA.Relationships.and.Inheritance.Models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.List;


@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String title;

    @ElementCollection
    @CollectionTable(name = "name", joinColumns = @JoinColumn(name = "name_id"))
    private List<Name> names;

    public Contact() {}

    public Long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    public List<Name> getNames() {
        return names;
    }
}
