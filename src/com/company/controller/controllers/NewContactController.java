package com.company.controller.controllers;

import com.company.controller.BaseController;
import com.company.model.Contact;
import com.company.model.parts.PersonalInfo;
import com.company.model.parts.PhoneNumber;
import com.company.storage.ContactStorage;

import java.util.List;
import java.util.Scanner;

public class NewContactController implements BaseController {

    private static List<Contact> contacts = ContactStorage.getContacts();


    @Override
    public void process() {
        //Name, email, phoneNumber, phoneNumberType
        System.out.println("Enter contact name:");

        String name = new Scanner(System.in).nextLine();

        System.out.println("Enter contact email:");
        String email = new Scanner(System.in).nextLine();

        PersonalInfo personalInfo = new PersonalInfo(name, email);

        Contact contact = new Contact(personalInfo);

        while (true) {
            PhoneNumber phoneNumber = getPhoneNumber();
            contact.addPhoneNumber(phoneNumber);


            System.out.println("Add more numbers? (yes)");
            String moreNumbers = new Scanner(System.in).nextLine();
            if (!moreNumbers.equals("yes")) {
                break;
            }
        }


        contacts.add(contact);
    }

    private PhoneNumber getPhoneNumber() {
        System.out.println("Enter phone number: ");
        String number = new Scanner(System.in).nextLine();

        System.out.println("Enter phone number type: ");
        String phoneNumberType = new Scanner(System.in).nextLine();

        return new PhoneNumber(number, phoneNumberType);
    }
}
