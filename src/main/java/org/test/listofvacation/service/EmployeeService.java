package org.test.listofvacation.service;

import org.test.listofvacation.dto.EmployeeDataProvider;
import org.test.listofvacation.entities.Employee;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDataProvider> getEmployeesWithVacations();

    List<Employee> getEmployees();


    String addEmployee(Employee employee);
}
