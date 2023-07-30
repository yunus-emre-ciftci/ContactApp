package com.yunusemre.contactapp.dal.dao;

import com.yunusemre.contactapp.dal.ContactDataAccess;
import com.yunusemre.contactapp.domain.Contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContactJDBC implements ContactDataAccess {
    public static final String URL = "jdbc:postgresql://localhost:5432/ContactApp";
    public static final String USER = "postgres";
    public static final String PASSWORD = "000000";


    @Override
    public void addContact(Contact newContact) {
        String addQuery = "INSERT INTO t_informations_contact (full_name, e_mail, phone_number, contact_id) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(addQuery)) {
            preparedStatement.setString(1, newContact.getFullName());
            preparedStatement.setString(2, newContact.geteMail());
            preparedStatement.setString(3, newContact.getPhoneNumber());
            preparedStatement.setInt(4, newContact.getId());

            int i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printAll() {

    }

    @Override
    public ArrayList<Contact> findContactByName(String name) {
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
