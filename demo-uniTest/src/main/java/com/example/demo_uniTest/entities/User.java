package com.example.demo_uniTest.entities;

import jakarta.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false, unique = true)
    private String FiscalCode;

    public User() {
    }

    public User(Long id, String name, String surname, String fiscalCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        FiscalCode = fiscalCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFiscalCode() {
        return FiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        FiscalCode = fiscalCode;
    }
}
