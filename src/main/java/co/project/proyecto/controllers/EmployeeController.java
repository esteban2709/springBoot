package co.project.proyecto.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.project.proyecto.models.Employee;
import co.project.proyecto.repository.EmployeeRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeRepository employeeRepository;
    
    public EmployeeController (EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @CrossOrigin
    @GetMapping("/employees")
    public List<Employee> allEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    
}
