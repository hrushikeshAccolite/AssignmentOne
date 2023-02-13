// get list of employees who have salary more than 10000 in all departments using stream api
import java.util.*;
import java.util.stream.Collectors;
class Emp{
    String name;
    String department;
    String designation;
    int salary;
    long contactno;

    public Emp(String name, String department, String designation, int salary, long contactno) {
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.contactno = contactno;
    }
}

public class EmpSalary {
    public static void main(String[] args){
        Map<String, List<Emp>> map = new HashMap<>();
        Emp e1 = new Emp("Hrushikesh", "IT", "SDE", 9000, 1234237890);
        Emp e2 = new Emp("Rahul", "HR", "HR", 11000, 1213456780);
        Emp e3 = new Emp("Sid", "HR", "HR", 20000, 1234567510);
        Emp e4 = new Emp("Tanmay", "IT", "Manager", 15000, 1224567890);
        Emp e5 = new Emp("Rutvik", "IT", "SD2", 20000, 1231567890);
        Emp e6 = new Emp("Atharva", "ACCOUNTS", "Manager", 2000, 1234567990);
        Emp e7 = new Emp("Rohit", "ACCOUNTS", "Manager", 13000, 1234567860);
        
        List<Emp> list1 = new ArrayList<>();
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);
        list1.add(e4);
        list1.add(e5);
        list1.add(e6);
        list1.add(e7);
        
        map.put("IT", list1.stream().filter(e -> e.department.equals("IT")).filter(e -> e.salary > 10000).collect(Collectors.toList()));
        map.put("HR", list1.stream().filter(e -> e.department.equals("HR")).filter(e -> e.salary > 10000).collect(Collectors.toList()));
        map.put("ACCOUNTS", list1.stream().filter(e -> e.department.equals("ACCOUNTS")).filter(e -> e.salary > 10000).collect(Collectors.toList()));
        System.out.println(map);
    }
}
