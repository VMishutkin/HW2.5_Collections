package mish.vlad.hw25_collections;

import java.util.List;

public interface EmployeeService {

    public List<Employee> printEmployees();
    public Employee addEmployee(String firstName, String lastName);
    public Employee removeEmployee(String firstName, String lastName);
    public Employee findEmployee(String firstName, String lastName);
}
