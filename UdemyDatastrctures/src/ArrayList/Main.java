package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

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

    public  boolean isPalandrom( String string){
        LinkedList<Character> stack= new LinkedList<Character>();
        StringBuilder stringNoPunctauation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();
        for(int i=0;i<lowerCase.length();i++){
            char c = lowerCase.charAt(i);
            if(c>='a' && c<='z'){
                stringNoPunctauation.append(c);
                stack.push(c);
            }

        }
        StringBuilder reversed = new StringBuilder(stack.size());
        while(!stack.isEmpty())
            reversed.append(stack.pop());
        return reversed.toString().equals(stringNoPunctauation.toString());
    }
}
