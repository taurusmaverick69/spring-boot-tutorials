package com.maverick.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class Customer {

    @Id
    public String id;
    public String firstName;
    public String lastName;

}
