package org.test.listofvacation.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.listofvacation.entities.Employee;
import org.test.listofvacation.service.EmployeeService;

import java.util.List;

@Service
public class FacadeEmployeesService {

    @Autowired
    EmployeeService employeeService;

    public List<Employee> getEmployeeList(){
        return employeeService.getEmployees();
    }
}
