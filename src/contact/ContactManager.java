package contact;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contactList;

    public ContactManager() {
        contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void deleteContact(Contact contact) {
        contactList.remove(contact);
    }

    public void deleteAllContact() {
        contactList.clear();
    }

    public void getAllContact() {
        for (Contact contact : contactList) {
            if (contact != null) {
                System.out.println(contact.toString());
            }
        }
        if (contactList.isEmpty()) {
            throw new NullPointerException("Contact is not found.");
        }

    }

    public void findWithFullName(String fullName) {
        boolean isFind = false;
        for (Contact contact : contactList) {
            if (contact.getFullName().equals(fullName)) {
                System.out.println(contact.toString());
                isFind = true;
            }

        }
        if (!isFind) {
            throw new IllegalArgumentException("Not found.");
        }

    }

    public Contact updateContact(Contact contact, String fullName, String eMail, String phoneNumber) {
        for (Contact contact1 : contactList) {
            if (contact1.equals(contact)) {
                contact1.setFullName(fullName);
                contact1.seteMail(eMail);
                contact1.setPhoneNumber(phoneNumber);
                return contact1;
            }
        }
        throw new IllegalArgumentException("Not found.");
    }
}
