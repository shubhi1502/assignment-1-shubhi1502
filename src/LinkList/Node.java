package LinkList;

import Person.Person;

public class Node {

    private Person data;
    private Node next;

    Node(Person data)
    {
        this.data = data;
    }

    public Person getData() {
        return data;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}