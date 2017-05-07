package com.maverick.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "`group`")
public class Group {

    @Id
    private int id;
    private String name;
}
