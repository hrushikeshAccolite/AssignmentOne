// array have multiple have object of employee class and may have duplicate objects
// remove duplicate objects from array and return new array


// The equals() method compares if two objects are equal semantically, e.g. comparing the data members of the class.
// The hashCode()method returns an integer value which is used to distribute elements in buckets of a hashtable-based collection.
// And remember the contract between equals() and hashCode()methods:
// When the equals() method is overridden, the hashCode() method must be overridden as well.
// If two objects are equal, their hash codes must be equal as well.
// If two objects are not equal, there’s no constraint on their hash codes (their hash codes can be equal or not).
// If two objects have identical hash codes, there’s no constraint on their equality (they can be equal or not).
// If two objects have different hash codes, they must not be equal.
import java.util.*;

class EmpDetailExample{
    int empId;
    String name;
    long contact;

    EmpDetailExample(int empId, String name, Long contact){
        this.empId = empId;
        this.name = name;
        this.contact = contact;
    }

    public int hashCode(){
        return empId;
    }

    public boolean equals(Object obj){
        if(obj instanceof EmpDetailExample){
            EmpDetailExample e = (EmpDetailExample) obj;
            if(e.empId == this.empId && e.name.equals(this.name) && e.contact == this.contact){
                return true;
            }
        }
        return false;
    }
}

public class RemoveDup {
    public static void main(String[] args){
        Set<EmpDetailExample> set = new HashSet<EmpDetailExample>();

        EmpDetailExample e1 = new EmpDetailExample(1, "abc", 9987300988L);
        EmpDetailExample e2 = new EmpDetailExample(1, "abc", 9987300988L);
        EmpDetailExample e3 = new EmpDetailExample(3, "pqr", 9187330988L);
        EmpDetailExample e4 = new EmpDetailExample(4, "mno", 9987300988L);
        EmpDetailExample e5 = new EmpDetailExample(5, "zzz", 2312882118L);


        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        System.out.println(set);

    }
}
