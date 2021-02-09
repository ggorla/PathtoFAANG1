package Queue;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String Lastname;

    @Override
    public String toString() {
        return "EmployeeLinkedList{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", Lastname='" + Lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee that = (Employee) o;
        return id == that.id && Objects.equals(firstName, that.firstName) && Objects.equals(Lastname, that.Lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, Lastname);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public Employee(int id, String firstName, String lastname) {
        this.id = id;
        this.firstName = firstName;
        Lastname = lastname;
    }
}
