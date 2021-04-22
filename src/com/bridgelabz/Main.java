package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Person> list = new ArrayList<>();
        Person person = new Person("virat","kohli","delhi","maharashtra","delhi","virat@gmail.com",4545,84787878);
        Person person1 = new Person("sachin","tendulkar","mumbai","maharashtra","mumbai","schin@gmail.com",4545,84787878);
        Person person2 = new Person("rohit","sharma","mumbai","rajsthan","banglore","rohit@gmail.com",4545,84787878);
        Person person3 = new Person("virat","kohli","delhi","maharashtra","delhi","virat@gmail.com",4545,84787878);
        person.display();
        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);

        System.out.println(list);

        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.edit();
        addressBook.delete();
        addressBook.Book();
        addressBook.sortByName();
        addressBook.searchByName("joe");
        addressBook.searchByCity("jalna");
        addressBook.searchByContact("ash@gmail.com");
    }
}
