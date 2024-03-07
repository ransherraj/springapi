package com.restapi.crudrest.dao;

import com.restapi.crudrest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findEmployees();
    Employee findEmployeeById(int id);
    Employee saveEmployee(Employee employee);
    void removeEmployee(int id);
}
