package com.yunusemre.contactapp.dal.dao;

import com.yunusemre.contactapp.dal.ContactDataAccess;
import com.yunusemre.contactapp.domain.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactMemoryManager implements ContactDataAccess {

    private List<Contact> contactList;

    public ContactMemoryManager() {
        this.contactList = new ArrayList<Contact>();
    }

    @Override
    public void addContact(Contact newContact) {
        contactList.add(newContact);
    }

    @Override
    public void printAll() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }
    }

    @Override
    public ArrayList<Contact> findContactByName(String name) {
        ArrayList<Contact> personList = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.getFullName().contains(name)) {
                personList.add(contact);
            }
        }
        return personList;
    }

    @Override
    public void removeContact(Contact contact) {
        contactList.remove(contact);
    }

    @Override
    public Contact deleteContact(Contact deleteContact) {
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            if (contact.getFullName().equals(deleteContact.getFullName())
                    && contact.geteMail().equals(deleteContact.geteMail())
                    && contact.getPhoneNumber().equals(deleteContact.getPhoneNumber())) {
                contactList.remove(i);
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact updateContact(Contact contact, int id) {
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact1 = contactList.get(i);
            if (contact1.getId() == id) {
                contact1.setFullName(contact.getFullName());
                contact1.seteMail(contact.geteMail());
                contact1.setPhoneNumber(contact.getPhoneNumber());
                return contact1;
            }
        }
        return null;
    }
}
