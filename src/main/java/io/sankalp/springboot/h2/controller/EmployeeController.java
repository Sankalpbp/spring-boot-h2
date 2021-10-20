package io.sankalp.springboot.h2.controller;

import io.sankalp.springboot.h2.dao.EmployeeRepository;
import io.sankalp.springboot.h2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public String saveEmployee (@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Employee saved successfully";
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee (@PathVariable Integer id) {
        return employeeRepository.findById(id).get();
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee () {
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/count")
    public long getNumberOfEmployees () {
        return employeeRepository.count();
    }

    @GetMapping("/employee/department/{department}")
    public Employee getEmployeeByDepartment ( @PathVariable String department) {
        return employeeRepository.findByDepartment(department);
    }

}
