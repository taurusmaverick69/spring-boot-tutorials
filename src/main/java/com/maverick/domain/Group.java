package com.maverick.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`group`")
@Data
public class Group {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

}
