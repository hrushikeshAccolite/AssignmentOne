// write a generic class to exchange the position of two elements in an array

class Gen<T>{
    T[] arr;

    Gen(T[] arr){
        this.arr = arr;
    }

    public void exchange(int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void display(){
        for(T i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class GenClass{
    public static void main(String[] args){
        Integer[] arr = {1, 20, 3, 4, 5, 18};
        Gen<Integer> obj = new Gen<Integer>(arr);
        obj.display();
        obj.exchange(0, 4);
        obj.display();

        String[] arr1 = {"Hello", "World", "Java", "C++"};
        Gen<String> obj1 = new Gen<String>(arr1);
        obj1.display();
        obj1.exchange(0, 3);
        obj1.display();
    }
}