package com.company.model.parts;

public class PhoneNumber {

    private String number;
    private String phoneNumberType;

    public PhoneNumber(String number, String phoneNumberType) {
        this.number = number;
        this.phoneNumberType = phoneNumberType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    @Override
    public String toString() {
        return String.format("Number: %s | Type: %s",
                this.number,
                this.phoneNumberType);
    }
}
