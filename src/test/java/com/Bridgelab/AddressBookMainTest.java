package com.Bridgelab;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import java.util.ArrayList;

/**
 * Test Class for AddressBookMain
 */
public class AddressBookMainTest {
    AddressBookMain addressbookmain;

    @Test
    public  void whenGivenAddressbook_whennAdded_shouldReturn_true(){
        addressbookmain=new AddressBookMain();
        Contacts contact=new Contacts();
        addressbookmain.contactDetails.add(contact);
        Assert.assertEquals(1,addressbookmain.contactDetails.size());
    }

    @Test
    public  void whenGivenAddressbook_whenAnotdded_shouldReturnContac_false(){
        addressbookmain=new AddressBookMain();
        Contacts contact=new Contacts();
        addressbookmain.contactDetails.add(contact);
        Assert.assertEquals(2,addressbookmain.contactDetails.size());
    }


}
