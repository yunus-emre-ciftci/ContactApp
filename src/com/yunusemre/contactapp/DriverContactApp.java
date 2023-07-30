package com.yunusemre.contactapp;

import com.yunusemre.contactapp.dal.dao.ContactJDBC;
import com.yunusemre.contactapp.dal.dao.ContactMemoryManager;
import com.yunusemre.contactapp.dal.dao.HardDiscDAO;
import com.yunusemre.contactapp.domain.Contact;
import com.yunusemre.contactapp.service.ContactService;

public class DriverContactApp {
    public static void main(String[] args) {
        test1();
        // test2();
    }

    public static void test1() {
        Contact contact = new Contact("Hacı Karataş", "0545233123", "hacikaratas@gmail.com");
        Contact contact1 = new Contact("Abdülkadir Kılınç", "0545233124", "akadirkilinc@gmail.com");
        Contact contact2 = new Contact("Yunus Emre Çiftçi", "0545233125", "yunusemreciftci@gmail.com");
        ContactJDBC contactJDBC = new ContactJDBC();
        contactJDBC.addContact(contact);

       /* HardDiscDAO hardDiscDAO = new HardDiscDAO();
        ContactMemoryManager contactMemoryManager = new ContactMemoryManager();
        ContactService contactService = new ContactService(hardDiscDAO);
        contactService.printAll();
        */


    }

    public static void test2() {
        Contact contact = new Contact("Hacı Karataş", "0545233123", "hacikaratas@gmail.com");
        Contact contact1 = new Contact("Abdülkadir Kılınç", "0545233124", "akadirkilinc@gmail.com");
        Contact contact2 = new Contact("Yunus Emre Çiftçi", "0545233125", "yunusemreciftci@gmail.com");
        ContactMemoryManager contactMemoryManager = new ContactMemoryManager();
        contactMemoryManager.addContact(contact);
        contactMemoryManager.addContact(contact1);
        contactMemoryManager.addContact(contact2);
        Contact contact3 = new Contact("İkram Dağcı", "0545123312", "ikramdagci@gmail.com");


    }
}
