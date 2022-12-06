package com.demo.envsql.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "locker")
public class Locker {
    @Id
    private Long id;
    private String owner;
}
