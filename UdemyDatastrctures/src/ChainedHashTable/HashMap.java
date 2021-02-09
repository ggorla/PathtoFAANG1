package ChainedHashTable;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Employee janeJones = new Employee(12,"Jane","Jones");
        Employee JohnDoe = new Employee(12,"John","Doe");
        Employee marySmith = new Employee(12,"Mary","Smith");
        Employee mikeWilson = new Employee(12,"Mike","Wilson");
        Map<String,Employee> hashMap = new java.util.HashMap<String, Employee>();
        hashMap.put("Jones",janeJones);
        hashMap.put("Doe",JohnDoe);
        hashMap.put("Smith",marySmith);
        hashMap.put("Doe", mikeWilson);

        hashMap.forEach((k,v) -> System.out.println("Key: "+k+"Value: "+v));


    }
}
