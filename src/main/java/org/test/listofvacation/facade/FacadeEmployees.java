package org.test.listofvacation.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.listofvacation.dto.EmployeeDataProvider;
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

    public List<EmployeeDataProvider> getEmployeeVacationList(){
        return employeeService.getEmployeesWithVacations();
    }

    public List<Vacation> getVacationsList() {
        return vacationService.getVacations();
    }
}
