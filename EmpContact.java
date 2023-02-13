// Write a program to list how many employees have the same contact number using Collection

import java.util.*;
class EmpDetails {
    int empId;
    String name;
    long contact;

    EmpDetails(int empId, String name, Long contact){
        this.empId = empId;
        this.name = name;
        this.contact = contact;
    }
}

public class EmpContact {
    public static void main(String[] args) {
        List<EmpDetails> list = new ArrayList<>();
        Map<Long, Integer> sameContact = new HashMap<Long, Integer>();
        EmpDetails e1 = new EmpDetails(1, "abc", 9987300988L);
        EmpDetails e2 = new EmpDetails(2, "xyz", 9987300988L);
        EmpDetails e3 = new EmpDetails(3, "pqr", 9187330988L);
        EmpDetails e4 = new EmpDetails(4, "mno", 9987300988L);
        EmpDetails e5 = new EmpDetails(5, "stu", 8987330981L);
        EmpDetails e6 = new EmpDetails(6, "vwx", 7987370982L);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);

        // System.out.println("List of employees: " + list);

        Map<Long, String> map = new HashMap<Long, String>();
        for(EmpDetails e : list){
            if(map.containsKey(e.contact)){
                map.put(e.contact, map.get(e.contact) + ", " + (e.name));
                sameContact.put(e.contact, 1);
            }
            else{
                map.put(e.contact, String.valueOf(e.name) );
            }
        }

        for(Long key : sameContact.keySet()){
            System.out.println(map.get(key));
        }
    }
}