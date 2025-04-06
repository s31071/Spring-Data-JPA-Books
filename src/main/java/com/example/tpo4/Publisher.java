package com.example.tpo4;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//publisher can publish MANY books (ONE -> MANY)

@Entity
public class Publisher{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPublisher;
    private String name;
    private String country;
    private String email;
    private String phoneNo;

    public Publisher(){}

    public Publisher(Long idPublisher, String name, String country, String email, String phoneNo){
        this.idPublisher = idPublisher;
        this.name = name;
        this.country = country;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public Long getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(Long idPublisher) {
        this.idPublisher = idPublisher;
    }
}
