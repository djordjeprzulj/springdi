package com.qualityhouse.springdi.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="djordje_company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "company")
    private List<Employee> employees;

    public Company() {

    }

    public Company(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
