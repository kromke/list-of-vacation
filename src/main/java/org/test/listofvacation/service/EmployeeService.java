package org.test.listofvacation.service;

import org.test.listofvacation.dto.EmployeeDataProvider;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDataProvider> getEmployeesWithVacations();

}
