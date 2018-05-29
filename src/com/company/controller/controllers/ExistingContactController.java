package com.company.controller.controllers;

import com.company.controller.BaseController;
import com.company.model.Contact;
import com.company.storage.ContactStorage;

import java.util.List;

public class ExistingContactController implements BaseController {
    List<Contact> contacts = ContactStorage.getContacts();

    @Override
    public void process() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }
}
