package mish.vlad.hw25_collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/employee")

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;
    @GetMapping
    public String greetings(){
        return "Добро пожаловать в самый убогий справочник сотрудников";
    }

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName")String lastName){
        return employeeService.addEmployee(firstName, lastName);
    }
    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName")String lastName){
        return employeeService.removeEmployee(firstName, lastName);
    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName")String lastName){

            return employeeService.findEmployee(firstName, lastName);

    }
    @GetMapping("/print")
    public List<Employee> printEmployees(){

        return employeeService.printEmployees();
    }




}
