package com.company.model;

import com.company.model.parts.Address;
import com.company.model.parts.Organization;
import com.company.model.parts.PersonalInfo;
import com.company.model.parts.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private List<PhoneNumber> phoneNumbers;
    private PersonalInfo personalInfo;
    private Organization organization;
    private Address address;

    public Contact(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Contact(List<PhoneNumber> phoneNumbers, PersonalInfo personalInfo, Organization organization, Address address) {
        this.phoneNumbers = phoneNumbers;
        this.personalInfo = personalInfo;
        this.organization = organization;
        this.address = address;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }

        this.phoneNumbers.add(phoneNumber);
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (this.personalInfo != null) {
            System.out.printf("\t\t%s\t\t\n", this.personalInfo.getName());
            builder.append(this.personalInfo.toString())
                    .append("\n\n");
        }

        if (this.phoneNumbers != null) {
            builder.append("Numbers")
                    .append("\n");
            for (PhoneNumber phoneNumber : phoneNumbers) {
                builder.append(phoneNumber.toString())
                        .append("\n");
            }
            builder.append("\n");
        }

        builder.append("-----------------------------------\n");
        return builder.toString();
    }
}
