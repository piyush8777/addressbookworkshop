package com.addressbookworkshop;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AddressBookTest {
	 @Test
	    public void GivenContact_whenReturn_SholdReturnTest(){
	        AddressBook address = new AddressBook();
	        Contacts contact = new Contacts("Piyush", "Shaw", "Howrah", "Howrah", "WestBengal", "444444", "999999999", "piyush@gmail.com");
	        boolean result = address.AddContact(addressbook);
	        Assertions.assertTrue(result);
	    }

}
