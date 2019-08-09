package io.pivotal.pal.tracker.controller;

import io.pivotal.pal.tracker.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.pivotal.pal.tracker.services.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {

@Autowired
    EmployeeService employeeService;

@GetMapping("/employees")
public List<Employee> getEmployeeList(){
    List<Employee> employeeList = employeeService.getEmployeeList();

    return employeeList;
}


}

