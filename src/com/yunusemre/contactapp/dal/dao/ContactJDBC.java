package com.yunusemre.contactapp.dal.dao;

import com.yunusemre.contactapp.dal.ContactDataAccess;
import com.yunusemre.contactapp.domain.Contact;

import java.sql.*;
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
            if (i > 0) {
                System.out.println("Complete!");
            } else {
                System.out.println("Error!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printAll() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM t_informations_contact")
        ) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String fullName = resultSet.getString("full_name");
                String eMail = resultSet.getString("e_mail");
                String phoneNumber = resultSet.getString("phone_Number");
                int id = resultSet.getInt("contact_id");
                System.out.println("Contact-id:" + id + " Name: " + fullName + " eMail: " + eMail + " Phone Number: " + phoneNumber);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
