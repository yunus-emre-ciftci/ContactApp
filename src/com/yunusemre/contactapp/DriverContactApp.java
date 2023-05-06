package com.yunusemre.contactapp;

import com.yunusemre.contactapp.dal.ContactDataAccess;
import com.yunusemre.contactapp.dal.dao.ContactMemoryManager;
import com.yunusemre.contactapp.dal.dao.HardDiscDAO;
import com.yunusemre.contactapp.domain.Contact;

public class DriverContactApp {
    public static void main(String[] args) {
        test1();
       // test2();
    }

    public static void test1() {
        Contact contact = new Contact("Hacı Karataş", "0545233123", "hacikaratas@gmail.com");
        Contact contact1 = new Contact("Abdülkadir Kılınç", "0545233124", "akadirkilinc@gmail.com");
        Contact contact2 = new Contact("Yunus Emre Çiftçi", "0545233125", "yunusemreciftci@gmail.com");

        HardDiscDAO hardDiscDAO = new HardDiscDAO();
        hardDiscDAO.findContactWithName("Yunus emre çiftçi");
        hardDiscDAO.printAll();


    }
    public static void test2(){
        Contact contact = new Contact("Hacı Karataş", "0545233123", "hacikaratas@gmail.com");
        Contact contact1 = new Contact("Abdülkadir Kılınç", "0545233124", "akadirkilinc@gmail.com");
        Contact contact2 = new Contact("Yunus Emre Çiftçi", "0545233125", "yunusemreciftci@gmail.com");
        ContactMemoryManager contactMemoryManager = new ContactMemoryManager();
        contactMemoryManager.addContact(contact);
        contactMemoryManager.addContact(contact1);
        contactMemoryManager.addContact(contact2);
        Contact contact3 = new Contact("İkram Dağcı", "0545123312","ikramdagci@gmail.com");
        contactMemoryManager.updateContact(contact3,2);
        contactMemoryManager.printAll();


    }
}
