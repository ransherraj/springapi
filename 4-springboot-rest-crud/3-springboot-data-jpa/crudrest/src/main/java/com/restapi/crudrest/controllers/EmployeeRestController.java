package com.restapi.crudrest.controllers;

import com.restapi.crudrest.entity.Employee;
import com.restapi.crudrest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class EmployeeRestController {

    //
    /*private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }*/

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findEmployees(){
        return employeeService.findAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee emp = employeeService.findEmployeeById(employeeId);
        if(emp == null){
            throw new RuntimeException("Employee Id not found : " + employeeId);
        }
        return emp;
    }

    // Add mapping for POST / employee -  add new employee

    //@PostMapping("/employees/{employeeId}")
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee emp){
        // emp.setId(0);
        Employee dbEmployee = employeeService.saveEmployee(emp);
        return dbEmployee;
    }

    // Add mapping for POST / employee -  add new employee

    //@PostMapping("/employees/{employeeId}")
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee emp){
        // emp.setId(0);
        Employee dbEmployee = employeeService.saveEmployee(emp);
        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId){
        Employee tempEmployee = employeeService.findEmployeeById(employeeId);

        System.out.println("tempEmployee : " + tempEmployee);
        if(tempEmployee == null){
            throw new RuntimeException("Employee Id not found - " + employeeId);
        }
        employeeService.removeEmployee(employeeId);
        System.out.println("Employee Deleted Successfully : "+ employeeId);
    }

}
