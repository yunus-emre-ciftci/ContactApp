package contact;

import java.util.ArrayList;

public interface ContactDataAccess {
    void addContact(Contact newContact);

    void printAll();

    ArrayList<Contact> findContactWithName(String name);

    void removeContact(Contact contact);

    Contact deleteContact(Contact deleteContact);

    Contact updateContact(Contact contact, int id);

}
