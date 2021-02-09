package HashTable;

import java.util.*;

public class HashTableDuplicates {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(123,"Jane","Jones"));
        employees.add(new Employee(21232,"Mary","Smith"));
        employees.add(new Employee(3432,"John","Doe"));
        employees.add(new Employee(3948,"Bill","End"));
        employees.add(new Employee(123,"Jane","Jones"));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("+++++++++++++++");
        Map<Integer,Employee> hashTable = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(hashTable.containsKey(employee.getId())) {
                iterator.remove();
            }
            hashTable.put(employee.getId(), employee);
        }

        hashTable.forEach((k,v)-> System.out.println("key:"+k+"value: "+v));


    }
}
