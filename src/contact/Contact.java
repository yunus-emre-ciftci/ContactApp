package contact;

import java.util.Objects;

public class Contact {
    private String fullName;
    private String phoneNumber;
    private String eMail;

    public Contact(String fullName, String phoneNumber, String eMail) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public Contact(String fullName, String phoneNumber) {
        this(fullName, phoneNumber, "");
    }

    public Contact(String fullName) {
        this(fullName, "", "");
    }

    public String geteMail() {
        return eMail;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(fullName, contact.fullName) && Objects.equals(phoneNumber, contact.phoneNumber) && Objects.equals(eMail, contact.eMail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, phoneNumber, eMail);
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
