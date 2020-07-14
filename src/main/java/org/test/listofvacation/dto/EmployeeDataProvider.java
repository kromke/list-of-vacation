package org.test.listofvacation.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.test.listofvacation.entities.Employee;
import org.test.listofvacation.entities.Vacation;

import java.util.List;

@Data
@NoArgsConstructor
public class EmployeeDataProvider extends Employee {

    private List<Vacation> vacations;

    public EmployeeDataProvider setVacations(List<Vacation> vacations) {
        this.vacations = vacations;
        return this;
    }

}
