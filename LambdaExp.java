@FunctionalInterface
interface Addable{
    int add(int a, int b);  
}  

public class LambdaExp {
    public static void main(String[] args) {
        Addable x=(a, b)->(a+b);
        System.out.println(x.add(10, 20));
        System.out.println(x.add(100, 200));
    }
}