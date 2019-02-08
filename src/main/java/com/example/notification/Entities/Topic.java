package com.example.notification.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    @NotNull
    private String name;


    public Topic(){}


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
