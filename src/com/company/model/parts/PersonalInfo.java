package com.company.model.parts;

public class PersonalInfo {

    private String name;
    private String email;


    public PersonalInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Name: %s \n" +
                        "Email: %s",
                this.name,
                this.email);
    }
}
