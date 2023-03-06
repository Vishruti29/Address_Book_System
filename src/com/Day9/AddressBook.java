package com.Day9;
public class AddressBook {
    public static void main(String[] args) {

    }

    class Contact {
        private String firstName;
        private String lastName;
        private String city;
        private String state;
        private String zip;
        private String phoneNumber;
        private String email;

        public Contact(String firstName, String lastName, String city, String state, String zip, String phoneNumber, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

    }
}