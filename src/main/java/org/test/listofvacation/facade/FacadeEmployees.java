package org.test.listofvacation.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.listofvacation.dto.EmployeeDataProvider;
import org.test.listofvacation.service.EmployeeService;

import java.util.List;

@Service
public class FacadeEmployees {

    @Autowired
    EmployeeService employeeService;

    public List<EmployeeDataProvider> getEmployeeList(){
        return employeeService.getEmployees();
    }
}
