package Collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) throws IOException {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(8);
        System.out.println(myLinkedList.get(3).getValue());
        System.out.println(myLinkedList.get(2).getValue());
        myLinkedList.delete(2);
        System.out.println(myLinkedList.get(2).getValue());
        System.out.println(myLinkedList.getAll());


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

    public Element get(int index) throws IOException {
        int currentIndex = 0;
        Element element = this.head;
        while (currentIndex != index) {
            element = element.getNext();
            if (element == null) {
                throw new IOException("No this index");
            }
            currentIndex += 1;
        }
        return element;
    }

    public void delete(int index) throws IOException {
        int currentIndex = 0;
        Element element = this.head;
        while (currentIndex != index) {
            element = element.getNext();
            if (element == null) {
                throw new IOException("No this index");
            }
            currentIndex += 1;
        }
        Element prevElement = element.getPrev();
        Element nextElement = element.getNext();
        prevElement.setNext(nextElement);
        nextElement.setPrev(prevElement);
    }

    public List<Element> getAll() {
        List<Element> list = new ArrayList<>();
        Element element = this.head;

        while (element.getNext() != null) {
            list.add(element);
            element = element.getNext();
        }
        return list;
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

    @Override
    public String toString() {
        return "Element{" +
                "value=" + value +
                '}';
    }
}
