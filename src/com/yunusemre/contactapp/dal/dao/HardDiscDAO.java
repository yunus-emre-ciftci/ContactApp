package com.yunusemre.contactapp.dal.dao;

import com.yunusemre.contactapp.domain.Contact;
import com.yunusemre.contactapp.dal.ContactDataAccess;
import com.yunusemre.contactapp.util.StringUtil;

import java.io.*;
import java.util.ArrayList;

public class HardDiscDAO implements ContactDataAccess {


    @Override
    public void addContact(Contact newContact) {
        File file = new File("contacts.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            String data = newContact.toString() + "\n";
            byte[] bytes = data.getBytes();
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void printAll() {
        try (BufferedReader reader = new BufferedReader(new FileReader("contacts.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Bulunamadı.");
        }
    }

    @Override
    public ArrayList<Contact> findContactWithName(String name) {
        ArrayList<Contact> contactsList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("contacts.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){
                String fullName = StringUtil.findByFieldName("fullName",line);
                if (fullName.toLowerCase().contains(name.toLowerCase())){
                    String eMail = StringUtil.findByFieldName("eMail",line);
                    String phoneNumber = StringUtil.findByFieldName("phoneNumber", line);
                    Contact contact = new Contact(fullName,phoneNumber,eMail);
                    contactsList.add(contact);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contactsList;
    }

    @Override
    public void removeContact(Contact contact) {
        try (BufferedReader reader = new BufferedReader(new FileReader("contacts.txt"))) {
            String line;
            String newData = "";
            String data = contact.toString();
            while ((line = reader.readLine()) != null) {
                if (!line.contains(data)) {
                    newData += line + "\n";
                }
            }
            FileWriter fileWriter = new FileWriter("contacts.txt");
            fileWriter.write(newData);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Contact deleteContact(Contact deleteContact) {
        removeContact(deleteContact);
        return deleteContact;
    }

    @Override
    public Contact updateContact(Contact contact, int id) {
        return null;
    }
}
