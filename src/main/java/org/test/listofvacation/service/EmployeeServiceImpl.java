package org.test.listofvacation.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.listofvacation.entities.Employee;
import org.test.listofvacation.repository.EmployeeRepoSpringData;
import org.test.listofvacation.repository.VacationRepoSpringData;

import java.util.List;

@Data
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepoSpringData employeeRepoSpringData;

    @Autowired
    VacationRepoSpringData vacationRepoSpringData;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepoSpringData.findAll();
    }
}
