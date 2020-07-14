package org.test.listofvacation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.listofvacation.dto.EmployeeDataProvider;
import org.test.listofvacation.entities.Employee;
import org.test.listofvacation.entities.Vacation;
import org.test.listofvacation.repository.EmployeeRepoSpringData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepoSpringData employeeRepoSpringData;

    @Autowired
    VacationService vacationService;

    @Override
    public List<EmployeeDataProvider> getEmployeesWithVacations() {
        List<Employee> employees = employeeRepoSpringData.findAll();
        Map<Employee, List<Vacation>> vacations = vacationService.getMappedVacations();
        return employees.stream().map(o -> new EmployeeDataProvider().setVacations(vacations.get(o)))
                .collect(Collectors.toList());
    }

    public List<Employee> getEmployees () {
        return employeeRepoSpringData.findAll();
    }

    public String addEmployee (Employee employee) {
        Employee e = employeeRepoSpringData.save(employee);
        return "ok";
    }

}
