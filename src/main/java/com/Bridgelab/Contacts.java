package com.Bridgelab;

import java.util.regex.Pattern;

public class Contacts {
    /**
     * Contacts related variable declaration
     */
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String email;
    private int zip;
    private int phonenumber;

    /**
     * Getter/setter methods to assign/retrieve the contact details
     * Added regular expression and handling exception using custome exception
     * @return
     */
        public String getFirstname() {
            return this.firstname = firstname;
        }

        public void setFirstname(String firstname) throws AddressBookException {
            boolean validatefirstname= Pattern.matches("[A-Z]+[A-Za-z]{2}",firstname);
            try {
                if(validatefirstname)
                this.firstname = firstname;
                else
                    throw new AddressBookException("Please Enter the valid firstname");
            }
            catch (AddressBookException ex)
            {
                System.out.println(ex.getMessage());
            }
        }

        public String getLastname() {
            return this.lastname = lastname;
        }

        public void setLastname(String lastname) throws AddressBookException {
            boolean validatelastname= Pattern.matches("[A-Z]+[A-Za-z]{2}",lastname);
            try {
                if(validatelastname)
                this.lastname=lastname;
                else
                    throw new AddressBookException("Please enter the valid lastname");
            }
            catch (AddressBookException ex)
            {
                System.out.println(ex.getMessage());
            }

        }

        public String getAddress()
        {
            return this.address = address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return this.city = city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return this.state = state;
        }

        public void setState(String state)
        {
            this.state = state;
        }

        public String getEmail() {
            return this.email = email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getZip() {
            return this.zip = zip;
        }

        public void setZip(int zip) throws AddressBookException {
            boolean validatezip=Pattern.matches("91\\s[0-9]{6}",String.valueOf(zip));
            try {
                if(validatezip)
                    this.zip = zip;
                else
                    throw new AddressBookException("Please enter the valid Zipcode");
            }
            catch (AddressBookException ex)
            {
                System.out.println(ex.getMessage());
            }

        }

        public int getPhoneNumber() {
            return this.phonenumber = phonenumber;
        }

        public void setPhoneNumber(int phonenumber) throws AddressBookException  {
            boolean validatephonenumber=Pattern.matches("91\\s[0-9]{10}",String.valueOf(phonenumber));
            try {
                if(validatephonenumber)
                    this.phonenumber = phonenumber;
                else
                     throw new AddressBookException("Please enter the valid Phonenumber");
            }
            catch (AddressBookException ex)
            {
                System.out.println(ex.getMessage());
            }

        }

        @Override
        public String toString(){
            return "Contact details:"+"\n"+"FirstName="+firstname+"\n"
                    +"LastName="+lastname+"\n"
                    +"City="+city+"\n"
                    +"State="+state+"\n"
                    +"Zip="+zip+"\n"
                    +"Address="+address;
        }


}
