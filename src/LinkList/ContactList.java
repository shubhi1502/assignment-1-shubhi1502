package LinkList;

import Person.Person;

import java.util.ArrayList;
import java.util.Collections;

public class ContactList {
    private Node head;

    public ContactList()
    {
        head = null;
    }

    public Node getHead()
    {
        return head;
    }

    public void setHead(Node head)
    {
        this.head = head;
    }


    private boolean isEmpty() {
        boolean response=false;
        if(head == null)
        {
            response=true;
        }
        return response;
    }
    public void insert(Person data)
    {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }

    public boolean printList()
    {
        boolean response=false;
        if(!isEmpty()) {
            response=true;
            System.out.println("Here are all your contacts: ");
            int i = 1;
            Node temp = head;
            while (temp != null) {
                System.out.println(i + ". " + temp.getData().getFname() + " " + temp.getData().getLname());
                temp = temp.getNext();
                i++;
            }
        }
        return response;
    }
    public String delete(int index)
    {
        String name="";
        int counter=1;
        Node temp=head;
        Node prev=null;
        if( index == 1)
        {
            name=temp.getData().getFname()+" "+temp.getData().getLname();
            head=head.getNext();
        }
        else
        {
            while(temp.getNext() != null)
            {
                prev = temp;
                temp = temp.getNext();
                counter++;
                if (counter == index) {
                    name = temp.getData().getFname() + " " + temp.getData().getLname();
                    prev.setNext(temp.getNext());
                    break;
                }
            }
        }
        return name;
    }
    public void view()
    {
        if(!isEmpty())
        {
            System.out.println("---Here are all your contacts---");
            ArrayList<String> nameList = new ArrayList<>();
            Node temp = head;
            while (temp != null)
            {
                nameList.add((temp.getData().getFname()+" "+temp.getData().getLname()));
                temp = temp.getNext();
            }
            Collections.sort(nameList);
            for (String s : nameList)
            {
                temp = head;
                while (temp != null)
                {
                    String name=temp.getData().getFname()+" "+temp.getData().getLname();
                    if (s.equals(name))
                    {
                        System.out.println("-------- * -------- * -------- * -------- * -------- * --------");
                        System.out.print(temp.getData());
                        System.out.println("-------- * -------- * -------- * -------- * -------- * --------");
                    }
                    temp = temp.getNext();
                }
            }
        }
        else
        {
            System.out.println("Contact list is empty");
        }
    }
    public void search(String name)
    {
        ArrayList<Person> arr=new ArrayList<>();
        Node temp=head;
        while(temp != null)
        {
            if(temp.getData().getFname().equals(name))
            {
                arr.add(temp.getData());
            }
            temp = temp.getNext();
        }
        if(arr.size() != 0)
        {
            System.out.println(arr.size()+" Match Found");
            for (Person p:arr)
            {
                System.out.println("-------- * -------- * -------- * -------- * -------- * --------");
                System.out.print(p);
                System.out.println("--------*--------*--------*--------*--------*--------");
            }
        }
        else
        {
            System.out.println("NO RESULTS FOUND!");
        }
    }

}