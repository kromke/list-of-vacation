package org.test.listofvacation.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.listofvacation.dto.Authorisation;
import org.test.listofvacation.dto.EmployeeDataProvider;
import org.test.listofvacation.dto.VacationDataProvider;
import org.test.listofvacation.entities.Employee;
import org.test.listofvacation.entities.Vacation;
import org.test.listofvacation.service.EmployeeService;
import org.test.listofvacation.service.VacationService;

import java.util.List;

@Service
public class FacadeEmployees {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    VacationService vacationService;

    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    public List<EmployeeDataProvider> getEmployeeVacationList() {
        return employeeService.getEmployeesWithVacations();
    }

    public List<VacationDataProvider> getVacationsList() {
        return vacationService.getVacationsSimplify();
    }

    public String addEmployee(Employee employee) {
        System.out.println("facade working");
        return employeeService.addEmployee(employee);
    }

    public Employee getAuthorisation(Authorisation auth) {
        return employeeService.getEmployeeWithLoginPassword(auth);
    }
}
