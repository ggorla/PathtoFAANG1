package HashTable;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee(12,"Jane","Jones");
        Employee JohnDoe = new Employee(12,"John","Doe");
        Employee marySmith = new Employee(12,"Mary","Smith");
        Employee mikeWilson = new Employee(12,"Mike","Wilson");

        SimpleHashTable tb = new SimpleHashTable();

        tb.push("Jones", janeJones);
        tb.push("Doe",JohnDoe);
        tb.push("Wilson",mikeWilson);
        tb.push("Smith",marySmith);
        tb.printHashTable();

        System.out.println("Retriving Wilson"+ tb.get("Wilson"));
        System.out.println("Retriving Wilson"+ tb.get("Smith"));
    }


}
