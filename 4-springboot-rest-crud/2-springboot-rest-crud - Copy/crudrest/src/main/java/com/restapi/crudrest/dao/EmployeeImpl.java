package com.restapi.crudrest.dao;

import com.restapi.crudrest.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeImpl implements EmployeeDAO {

    //Define fields entity manager
    private EntityManager entityManager;

    @Autowired
    public EmployeeImpl(EntityManager theEntityManager){
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findEmployees() {
        //create query

        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);

        // execute
        List<Employee> employeeList = query.getResultList();

        //return list
        return employeeList;
    }

    @Override
    public Employee findEmployeeById(int id) {

        //get Employee
        Employee theEmployee = entityManager.find(Employee.class, id);


        //return employee

        return theEmployee;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        //save Employee

        Employee dbEmployee = entityManager.merge(employee);
        //update employee
        return dbEmployee;
    }

    @Override
    public void removeEmployee(int id) {
        // find the employee
        Employee emp = entityManager.find(Employee.class,id);
        // delete the employee

        entityManager.remove(emp);

        System.out.println("Data deleted successfully");
    }
}
