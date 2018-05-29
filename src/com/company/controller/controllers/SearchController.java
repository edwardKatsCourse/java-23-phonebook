package com.company.controller.controllers;

import com.company.controller.BaseController;
import com.company.model.Contact;
import com.company.storage.ContactStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchController implements BaseController {

    private List<Contact> contactList = ContactStorage.getContacts();

    @Override
    public void process() {
        System.out.println("Enter contact name: ");
        String name = new Scanner(System.in).nextLine();
        List<Contact> contactsFound = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.getPersonalInfo() == null) {
                continue;
            }

            if (contact.getPersonalInfo().getName().toLowerCase().contains(name.toLowerCase())) {
                contactsFound.add(contact);
            }
        }

        System.out.println("Contacts found: " + contactsFound.size());
        for (Contact contact : contactsFound) {
            System.out.println(contact.toString());
        }

    }
}
