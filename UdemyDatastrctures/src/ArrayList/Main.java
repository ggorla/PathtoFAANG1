package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1,"jame","jones"));
        employeeList.add(new Employee(2,"test","jones"));
        employeeList.add(new Employee(3,"Mike","jones"));
        employeeList.add(new Employee(4,"Alex","jones"));

        employeeList.forEach(employee -> System.out.println(employee));
        //System.out.println(employeeList.get(1));


        Employee[] employees = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employees)
            System.out.println(employee);
    }
}
