package com.yunusemre.contactapp.dal;

import com.yunusemre.contactapp.domain.Contact;

import java.util.ArrayList;

public interface ContactDataAccess {
    void addContact(Contact newContact);

    void printAll();

    ArrayList<Contact> findContactByName(String name);

    void removeContact(Contact contact);

    Contact deleteContact(Contact deleteContact);

    Contact updateContact(Contact contact, int id);


}
