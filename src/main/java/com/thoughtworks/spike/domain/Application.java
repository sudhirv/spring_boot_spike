package com.thoughtworks.spike.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Application {
    @Id
    @GeneratedValue
    private Long id;

    private String status;

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
