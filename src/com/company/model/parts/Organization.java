package com.company.model.parts;

public class Organization {

    private String companyName;
    private String position;




















    public Organization(String companyName, String position) {
        this.companyName = companyName;
        this.position = position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
