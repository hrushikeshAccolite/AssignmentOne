// Create your own DS using generics with Add, Remove, Display functions using ArrayList

import java.util.*;

class ArrayL<T> {
    ArrayList<T> list = new ArrayList<T>();

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

public class ArrayListFn {
    public static void main(String[] args){
        ArrayL<Integer> list = new ArrayL<Integer>();
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


