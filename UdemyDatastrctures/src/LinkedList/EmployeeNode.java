package LinkedList;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;// dont have to set null explisitly as object not defined is null

    public EmployeeNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployeeLinkedList() {
        return employee;
    }

    public void setEmployeeLinkedList(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
    public String toString(){
        return employee.toString();
    }
}
