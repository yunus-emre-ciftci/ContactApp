package main;

import contact.Contact;
import contact.ContactManager;


public class Driver {
    public static void main(String[] args) {
        Contact contact = new Contact("y");
        Contact contact1 = new Contact("ye");
        Contact contact2 = new Contact("y3");
        Contact contact3 = new Contact("y4");
        Contact c = new Contact("e");

        ContactManager contactManager = new ContactManager();
        contactManager.addContact(contact);
        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);
        contactManager.addContact(c);
        contactManager.findWithFullName("y4");
        contactManager.updateContact(contact3, "Yunus Emre", "asdqqsd@gmail.com", "05412312");
        contactManager.findWithFullName("Yunus Emre");
        //contactManager.deleteAllContact();
        contactManager.getAllContact();
        contactManager.deleteAllContact();



    }

}
