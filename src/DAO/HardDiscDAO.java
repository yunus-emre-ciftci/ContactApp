package DAO;

import contact.Contact;
import contact.ContactDataAccess;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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

    }

    @Override
    public ArrayList<Contact> findContactWithName(String name) {
        return null;
    }

    @Override
    public void removeContact(Contact contact) {

    }

    @Override
    public Contact deleteContact(Contact deleteContact) {
        return null;
    }

    @Override
    public Contact updateContact(Contact contact, int id) {
        return null;
    }
}
