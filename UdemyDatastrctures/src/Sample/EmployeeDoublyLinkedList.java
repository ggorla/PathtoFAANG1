package Sample;

import jdk.nio.mapmode.ExtendedMapMode;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if(head==null)
            tail =node;
        else{
            head.setPrevious(node);
        }
        head = node;
    }
    public void printNode(){
        EmployeeNode current = head;
        while(current!=null){
            System.out.println(current);
            System.out.println("<=>");
            current = current.getNext();
        }
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if(tail==null)
            head = node;
        else{
            node.setPrevious(tail);
            tail.setNext(node);

        }
            }

    public void removeAtFirst() {
        EmployeeNode node = head;
        if(head.getNext()==null)
            tail = null;
        else{
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        node.setNext(null);

    }

    public void removeAtLast(){
        EmployeeNode removNode = tail;
        if(tail.getPrevious()==null){
            head = null;
        }
        else
            tail.getPrevious().setNext(null);
        tail = tail.getPrevious();
        removNode.setPrevious(null);
    }

    public boolean addBefore(Employee newEmploye, Employee oldEmployee){
        if(head== null){
            return false;
        }
        EmployeeNode current = head;
        while (current!=null && !current.getNode().equals(oldEmployee)){
            current= current.getNext();
        }
        if(current==null)
            return false;
        EmployeeNode newNode = new EmployeeNode(newEmploye);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);
        if(head== current){
            head = newNode;
        }else {
            newNode.getPrevious().setNext(newNode);
        }

        return false;
    }
}
