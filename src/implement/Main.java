package implement;


import LinkList.ContactList;
import Person.Person;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ContactList contactList=new ContactList();
        boolean c=true;
        while (true)
        {
            System.out.println("Welcome to My Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose)
            {
                case 1:
                    Person p = toGetDetails();
                    contactList.insert(p);
                    break;
                case 2:
                    contactList.view();
                    break;
                case 3:System.out.println("You could search for a contact from their first names:");
                    contactList.search(sc.nextLine());
                    break;
                case 4:
                    if(contactList.printList()) {
                        System.out.print("Press the number against the contact to delete it: ");
                        int num = sc.nextInt();
                        String name = contactList.delete(num);
                        System.out.println(name + "'s contact deleted from list!");
                    }
                    else{
                        System.out.println("Contact List Is Empty");
                    }
                    break;
                case 5:System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
    //method to get details of contact from user
    private static Person toGetDetails()
    {
        Scanner sc=new Scanner(System.in);
        Person p=new Person();
        System.out.print("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person\n" +
                "First Name: ");
        p.setFname(sc.nextLine());
        System.out.print("Last Name:");
        p.setLname(sc.nextLine());
        char response='y';
        ArrayList<BigInteger> number = new ArrayList<>();
        while(response == 'y' || response=='Y')
        {
            System.out.print("Contact Number: ");
            number.add(sc.nextBigInteger());
            System.out.print("Would you like to add another contact number? (y/n): ");
            response=sc.next().charAt(0);
        }
        p.setContactnumber(number);
        System.out.print("Would you like to add email address? (y/n): ");
        char ans=sc.next().charAt(0);
        sc.nextLine();
        if(ans=='y' || ans=='Y')
        {
            System.out.print("Email Address: ");
            p.setEmail(sc.nextLine());
        }
        return p;
    }
}