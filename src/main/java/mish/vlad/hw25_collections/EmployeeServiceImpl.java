package mish.vlad.hw25_collections;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final int SIZE = 5;
    private final List<Employee> employees;

    public EmployeeServiceImpl() {

        this.employees = new ArrayList<Employee>();
    }

    public List<Employee> printEmployees() {
        return employees;
    }

    public Employee addEmployee(String firstName, String lastName) {
        if (employees.contains(new Employee(firstName, lastName))) {
            throw new EmployeeAlreadyAddedException();
        }
        if (employees.size()>SIZE){
            throw new EmployeeStorageIsFullException();
        }
        Employee newEmployee = new Employee(firstName, lastName);
        employees.add(newEmployee);
        return newEmployee;
    }

    public Employee removeEmployee(String firstName, String lastName) {
        Employee removedEmployee = new Employee(firstName, lastName);
        if(!employees.contains(removedEmployee)){
            throw new EmployeeNotFoundException();
        }
        for (Employee employee : employees) {
            if (employee.equals(removedEmployee)){
                employees.remove(removedEmployee);
                return removedEmployee;
            }
        }
        return null;

    }



    public Employee findEmployee(String firstName, String lastName) {
        if (!employees.contains(new Employee(firstName, lastName))){
            throw new EmployeeNotFoundException();
        }

        return new Employee(firstName, lastName);
    }

}
