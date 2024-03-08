package com.restapi.crudrest.dao;

import com.restapi.crudrest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "members")
// api path + "/members"
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //that is it

}
