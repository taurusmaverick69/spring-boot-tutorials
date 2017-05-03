package com.maverick.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class Entity {

    @Id
    @GeneratedValue
    private int id;

}
