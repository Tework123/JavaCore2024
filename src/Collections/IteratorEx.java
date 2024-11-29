package Collections;

import java.util.ArrayList;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(6);
        System.out.println(myLinkedList.get(1).getValue());
// add extra function to linkedList on base file
    }
}

class MyLinkedList {
    private Element head;
    private Element tale;


    public void add(int value) {
        Element element = new Element(value);
        if (this.head == null) {
            this.head = element;
            this.tale = element;
            return;
        }
        this.tale.setNext(element);
        element.setPrev(this.tale);
        this.tale = element;

    }

    public Element get(int index) {
        int currentIndex = 0;
        Element element = this.head;
        while (currentIndex != index) {
            element = element.getNext();
            currentIndex += 1;
        }
        return element;
    }

    public static void next() {
    }


}

class Element {
    private Element prev;
    private Element next;
    private int value;

    public Element(int value) {
        this.value = value;

    }

    public Element getPrev() {
        return prev;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
