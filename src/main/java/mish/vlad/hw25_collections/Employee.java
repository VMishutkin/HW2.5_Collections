package mish.vlad.hw25_collections;

import java.util.Objects;

public class Employee {
    private String firstname;
    private String lastname;

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj==null || getClass()!= obj.getClass()) {
            return false;
        } else if (this == obj) {
            return true;
        }

        Employee anotherEmployee = (Employee) obj;
        return this.firstname.equals(anotherEmployee.firstname) && this.lastname.equals(anotherEmployee.lastname);
    }

    @Override
    public String toString() {
        return getLastname() + " " + getFirstname();

    }
}
