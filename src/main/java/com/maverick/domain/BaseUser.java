package com.maverick.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public abstract class BaseUser {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

}
