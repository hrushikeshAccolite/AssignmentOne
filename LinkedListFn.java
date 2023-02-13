// Create your own DS using generics with Add, Remove, Display functions using LinkedList

import java.util.*;

class LinkedL<T> {
    LinkedList<T> list = new LinkedList<T>();

    public void add(T item) {
        list.add(item);
    }

    public void remove(T item) {
        list.remove(item);
    }

    public void display() {
        System.out.println(list);
    }
}

public class LinkedListFn {
    public static void main(String[] args){
        LinkedL<Integer> list = new LinkedL<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
        list.remove(3);
        list.display();   
    }
}
