package org.test.listofvacation.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.test.listofvacation.entities.Employee;
import org.test.listofvacation.entities.Vacation;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class EmployeeDataProvider extends Employee {

    private List<Vacation> vacations;

    public EmployeeDataProvider setVacations(List<Vacation> vacations) {
        this.vacations = vacations;
        return this;
    }

}
