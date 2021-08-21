package com.Bridgelab;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
   public ArrayList<Contacts> contactDetails = new ArrayList<>();

    public static void main(String[] args){
        System.out.println("Welcome to AddressBook Management");
        AddressBookMain addmain=new AddressBookMain();
        addmain.addContactDetails();;
    }

    /***
     *Method to add the new contacts
     */
    public void addContactDetails() {

        try {
            Contacts details = new Contacts();//Object of Contacts
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the First Name of person:");
            details.setFirstname(sc.next());
            System.out.println("Enter the Last Name of person:");
            details.setLastname(sc.next());
            System.out.println("Enter the Address Name of person:");
            details.setAddress(sc.next());
            System.out.println("Enter the City Name of person:");
            details.setCity(sc.next());
            System.out.println("Enter the State Name of person:");
            details.setState(sc.next());
            System.out.println("Enter the Email of person:");
            details.setEmail(sc.next());
            System.out.println("Enter the Zip code of person:");
            details.setZip(sc.nextInt());
            System.out.println("Enter the Phone number of person:");
            details.setPhoneNumber(sc.nextInt());

            //to add multiple contact in the arraylist
            contactDetails.add(details);
            System.out.println("*******************************");
            System.out.println(details.toString());
        }
        catch (Exception e) {
         e.printStackTrace();
        }
    }
}



