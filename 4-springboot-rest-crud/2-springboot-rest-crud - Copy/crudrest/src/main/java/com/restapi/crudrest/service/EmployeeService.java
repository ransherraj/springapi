package com.restapi.crudrest.service;

import com.restapi.crudrest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployees();
    Employee findEmployeeById(int id);
    Employee saveEmployee(Employee employee);
    void removeEmployee(int id);
}
