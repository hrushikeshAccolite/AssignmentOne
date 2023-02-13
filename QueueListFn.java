// Create your own DS using generics with Add, Remove, Display functions using ArrayList

import java.util.*;

class QueueExample<T> {
    PriorityQueue<T> queue = new PriorityQueue<T>();

    public void add(T item) {
        queue.add(item);
    }

    public void remove(T item) {
        queue.remove(item);
    }

    public void display() {
        System.out.println(queue);
    }
}

public class QueueListFn {
    public static void main(String[] args){
        QueueExample<Integer> q = new QueueExample<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove(3);
        q.display();   
    }
}
