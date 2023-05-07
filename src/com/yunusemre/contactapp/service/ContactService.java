package com.yunusemre.contactapp.service;

import com.yunusemre.contactapp.dal.ContactDataAccess;
import com.yunusemre.contactapp.domain.Contact;

import java.util.ArrayList;

public class ContactService {
    private final ContactDataAccess contactDataAccess;

    public ContactService(ContactDataAccess contactDataAccess) {
        this.contactDataAccess = contactDataAccess;
    }

    public void addContact(Contact newContact) {
        contactDataAccess.addContact(newContact);
    }

    public void removeContact(Contact contact) {
        contactDataAccess.removeContact(contact);
    }

    public void printAll() {
        contactDataAccess.printAll();
    }

    public ArrayList<Contact> findContactByName(String name) {
        return contactDataAccess.findContactByName(name);
    }

    public Contact deleteContact(Contact deleteContact) {
        return contactDataAccess.deleteContact(deleteContact);
    }

    public Contact updateContact(Contact contact, int id) {
        return contactDataAccess.updateContact(contact, id);
    }


}
