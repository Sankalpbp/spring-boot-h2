package io.sankalp.springboot.h2.dao;

import io.sankalp.springboot.h2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByDepartment(String department);
}
