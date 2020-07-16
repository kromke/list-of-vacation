package org.test.listofvacation.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.test.listofvacation.entities.Employee;
import org.test.listofvacation.entities.Vacation;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDataProvider {

    private Employee employee;
    private List<Vacation> vacations;

}