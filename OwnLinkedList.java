// Create your own DS using generics with Add, Remove, Display functions using LinkedList\

class LL<T> {
    Node<T> head;

    static class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
            next = null;
        }
    }

    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        newNode.next = null;

        if(head == null){
            head = newNode;
        }else{
            Node<T> last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void print(){
        Node<T> curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public void delete(T data){
        Node<T> curr = head;
        Node<T> prev = null;

        if(curr != null && curr.data == data){
            head = curr.next;
            return;
        }

        while(curr != null && curr.data != data){
            prev = curr;
            curr = curr.next;
        }

        if(curr != null){
            prev.next = curr.next;
        }
    }
}

public class OwnLinkedList {
    public static void main(String[] args){
        LL<Integer> ll = new LL<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        System.out.println("Linked List after adding: ");
        ll.print();
        ll.delete(1);
        ll.delete(5);
        System.out.println("Linked List after deleting: ");
        ll.print();
    }
}
