package com.bamba;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "person")
public class Person {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    // Getters et setters
    public String getFirstName() {
        return this.firstName;
    }

    public  void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public  void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
