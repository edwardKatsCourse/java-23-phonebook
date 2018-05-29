package com.company.storage;

import com.company.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactStorage {

    private static List<Contact> contacts;

    public static List<Contact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<>();
        }

        return contacts;
    }
}
