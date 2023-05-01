package main;

import DAO.HardDiscDAO;
import contact.Contact;
import contact.ContactManager;


public class Driver {
    public static void main(String[] args) {
        Contact contact = new Contact("e");
        HardDiscDAO hardDiscDAO = new HardDiscDAO();
        hardDiscDAO.addContact(contact);
        hardDiscDAO.removeContact(contact);


    }

}
