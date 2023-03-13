package com.Day9;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args) {
        System.out.println(" Address Book ");
        System.out.println(" Enter Number 1(add) , 0(Exit) ");
        Scanner sc =new Scanner(System.in);
        int input =sc.nextInt();
        int exit=0;
        do{
            switch (input){
                case 0:
                    exit=1;
                    System.out.println("  Left Thank You ...");
                    break;
                case 1:
                    add();
                    break;
            }

        }while (exit!=1);

    }
    static void add(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Name :");
        String firstName = sc.nextLine();

        System.out.println("Enter Last Name :");
        String lastName = sc.nextLine();

        System.out.println("Enter City :");
        String city = sc.nextLine();

        System.out.println("Enter State :");
        String state = sc.nextLine();

        System.out.println("Enter Zip :");
        String zip = sc.nextLine();

        System.out.println("Enter Number :");
        String phoneNumber = sc.nextLine();

        System.out.println("Enter Email :");
        String email = sc.nextLine();

        System.out.println("Contact Added Successfully...");

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