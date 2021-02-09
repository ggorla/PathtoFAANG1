package ChainedHashTable;


public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee(12,"Jane","Jones");
        Employee JohnDoe = new Employee(12,"John","Doe");
        Employee marySmith = new Employee(12,"Mary","Smith");
        Employee mikeWilson = new Employee(12,"Mike","Wilson");

        ChainedHashTable ht = new ChainedHashTable();
        //ht.put("Jones",janeJones);
        ht.put("Jones", janeJones);
        ht.put("Doe",JohnDoe);
        ht.put("Wilson",mikeWilson);
        ht.put("Smith",marySmith);
        ht.printHashTable();
        System.out.println("retrive key Smith:"+ ht.get("Doe"));

        ht.remove("Jones");
        ht.printHashTable();
    }
}
