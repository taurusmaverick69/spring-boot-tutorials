package com.maverick.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "`group`")
@Getter
@Setter
public class Group extends com.maverick.domain.Entity {

    private String name;
}
