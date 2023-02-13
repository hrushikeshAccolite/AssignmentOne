// create a generic class to add two values of any type (integer, string, float)

class GClass<T> {
    T a, b;

    public void GenericClass(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T add(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf((Integer) a + (Integer) b);
        } else if (a instanceof String && b instanceof String) {
            return (T) new String((String) a + (String) b);
        } else if (a instanceof Double && b instanceof Double) {
               return (T) new Double((Double) a + (Double) b);
        } else {
            return null;
        }
    }
       
}


public class GenAddTwoValues {
    public static void main(String[] args){
        GClass<Integer> obj = new GClass<Integer>();
        System.out.println(obj.add(10, 20));
        
        GClass<String> obj1 = new GClass<String>();
        System.out.println(obj1.add("Hello ", "World"));

        GClass<Double> obj2 = new GClass<Double>();
        System.out.println(obj2.add(10.5, 20.5));
    }
}
