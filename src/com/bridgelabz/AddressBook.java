package com.bridgelabz;

import java.util.*;

public class AddressBook {
    /**
     * creating multiple as per user request to add contact its whole process is on client he want to add 100 contacts then he will be countinuously adding
     *
     */
    public  void addContact() {
        System.out.println("adding contact to address book using console:");
        System.out.println("enter a number to how many contacts you have to add");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<AddressBook> list = new ArrayList<>();
        AddressBook addressBook = new AddressBook();
        for(int i = 1;i <= number;i++) {
            System.out.println("enter your first name");
            Scanner scanner1 = new Scanner(System.in);
            String fName = scanner.next();
            System.out.println("enter your last name");
            String fLast = scanner.next();

            System.out.println("enter your address :");
            String address = scanner.next();
            System.out.println("enter your state name");
            String state = scanner.next();
            System.out.println("enter your city :");
            String city = scanner.next();
            System.out.println("enter your email");
            String email = scanner.next();
            System.out.println("enter your zip :");
            String zip = scanner.next();
            System.out.println("enter your contact no");
            String mobile = scanner.next();
            list.add(addressBook);
        }
        System.out.println(list);
    }

    /**
     * @method is used to edit person details by using their name
     */
    public void edit() {
        System.out.println("edit person details:");

        Person contact = new Person("Ashok","bhbd","dsghd","hsgdhdg","hdgh","dhjdc",2121,5454);
        System.out.println("enter a name whose data will you have to edit");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        List<Person> list = new ArrayList<>();

        if(name.equals(contact.getFirstName())) {
            System.out.println("you can edit");
            System.out.println("1/edit first name," +
                    "2/edit lastname," +
                    "3/edit address," +
                    "4/edit city," +
                    "5/edit state," +
                    "6/edit zip," +
                    "7/edit phone no");
            System.out.println("enter a number to edit details");
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    System.out.println("Re-Correct your firstName");
                    contact.firstName = scanner.next();
                    System.out.println("new firstName: " + contact.firstName);
                    break;
                case 2:
                    System.out.println("Re-Correct your lastname");
                    contact.lastName = scanner.next();
                    System.out.println("new lastname: " + contact.lastName);
                    break;
                case 3:
                    System.out.println("Re-Correct your Phone Number");
                    contact.phoneNo = scanner.nextInt();
                    System.out.println("new PhoneNo: " + contact.phoneNo);
                    break;
                case 4:
                    System.out.println("Re-Correct your City");
                    contact.city = scanner.next();
                    System.out.println("new city: " + contact.city);
                    break;
                case 5:
                    System.out.println("Re-Correct your Zip");
                    contact.zip = scanner.nextInt();
                    System.out.println("new zip: " + contact.zip);
                    break;
                case 6:
                    System.out.println("Re-Correct your State");
                    contact.state = scanner.next();
                    System.out.println("new state: " + contact.state);
                    break;
                case 7:
                    System.out.println("Re-Correct your phone no");
                    contact.state = scanner.next();
                    System.out.println("new phone no is: " + contact.phoneNo);

                    list.add(contact);
            }
            System.out.println(contact);
        }
        else {
            System.out.println("not a present name");
            edit();
        }
    }

    /**
     * @method is used to delete person details using their name
     */
    public  void  delete() {
        System.out.println("deleting element");
        System.out.println("enter a name to delete contact");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        List<Person> list = new ArrayList<>();
        Person contact = new Person("Ashok","bshb","sjjd","shds","sjhd","sjs",4555,4555);
        if(name.equals(contact.getFirstName())){
            list.remove("Ashok");
            System.out.println("deleted successfully");
            System.out.println(list);
        }
        else {
            System.out.println("not present in the list");
        }
    }

    /**
     * added multiple addressbook to see users which are available their
     */
    public void Book() {
        System.out.println("multiple addressbook adding");
        System.out.println("enter a number how many addressbook you want to create:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Map<Integer,String> map = new HashMap<>();
        for(int i = 1; i <= number; i++) {

            System.out.println("name for addressbook :");
            String name = sc.nextLine();

            map.put(1,name);
            map.put(2,name);
            map.put(3,name);
            map.put(4,name);
        }
        System.out.println(map);
    }

    /**
     *
     * @param firstname uses to search details by using their name
     */
    public void searchByName(String firstname) {
        System.out.println("searching list of person by using their name");
        Person contact = new Person("Ashok", "mane", "mumbai", "mahara", "jalna", "ash@gmail.com", 454, 544545);
        Person ashok = new Person("joe", "bidden", "hshdg", "sa", "us", "ash@gmail.com", 455, 4646);
        List<Person> list = new ArrayList();
        list.add(contact);
        list.add(ashok);

        for (int index = 0;index <= list.size();index++ ){
            if(list.get(index).getFirstName().equals(firstname)) {
                System.out.println(list.get(index));
                return;
            }
        }
    }

    /**
     *
     * @param city using city we can able to find person details
     */
    public  void  searchByCity(String city) {
        System.out.println("searching list by using city");
        Person contact = new Person("Ashok", "mane", "mumbai", "mahara", "jalna", "ash@gmail.com", 454, 544545);
        Person ashok = new Person("joe", "bidden", "hshdg", "sa", "us", "ash@gmail.com", 455, 4646);
        List<Person> list = new ArrayList();
        list.add(contact);
        list.add(ashok);

        for(int index = 0;index <= list.size(); index++ ) {
            if(list.get(index).getCity().equals(city)) {
                System.out.println(list.get(index));
                return;
            }
        }
    }

    /**
     *
     * @param email using email we find person details
     */
    public void searchByContact(String email) {
        System.out.println("searching list by using emails");
        Person contact = new Person("Ashok", "mane", "mumbai", "mahara", "jalna", "ash@gmail.com", 454, 544545);
        Person ashok = new Person("joe", "bidden", "hshdg", "sa", "us", "ash@gmail.com", 455, 4646);
        List<Person> list = new ArrayList();
        list.add(contact);
        list.add(ashok);

        for (int index =0;index<=list.size();index++ ) {
            if(list.get(index).getEmail().equals(email)) {
                System.out.println(list.get(index));
                return;
            }
        }
    }

    /**
     * using set interface treeset class sort our data and sorted all person data using set
     */
    public void sortByName() {
        System.out.println("sorted by name using set interface");
        Person ashok = new Person("joe", "bidden", "hshdg", "sa", "us", "ash@gmail.com", 455, 4646);
        Person contact = new Person("Ashok", "mane", "mumbai", "mahara", "jalna", "ash@gmail.com", 454, 544545);
        Person contact2 = new Person("joe", "bidden", "hshdg", "sa", "us", "ash@gmail.com", 455, 4646);
       Set set = new HashSet();
        set.add(contact);
        set.add(ashok);
        set.add(contact2);

        System.out.println(set);
    }
}
