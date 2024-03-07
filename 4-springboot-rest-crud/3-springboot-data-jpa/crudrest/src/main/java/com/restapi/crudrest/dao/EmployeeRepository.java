package com.restapi.crudrest.dao;

import com.restapi.crudrest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //that is it

}
