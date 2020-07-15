package org.test.listofvacation.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.test.listofvacation.dto.Authorisation;
import org.test.listofvacation.entities.Employee;
import org.test.listofvacation.facade.FacadeEmployees;

@RestController
public class AppController {

    @Autowired
    FacadeEmployees facadeEmployees;

    @Autowired
    ObjectMapper objectMapper;

    @CrossOrigin
    @SneakyThrows
    @GetMapping("/employees")
    public String getEmployees() {
        return objectMapper.writeValueAsString(facadeEmployees.getEmployeeVacationList());
    }

    @CrossOrigin
    @SneakyThrows
    @GetMapping("/vacations")
    public String getVacations() {
        return objectMapper.writeValueAsString(facadeEmployees.getVacationsList());
    }

    @CrossOrigin
    @SneakyThrows
    @GetMapping("/employees-vacations")
    public String getEmployeesVacations() {
        return objectMapper.writeValueAsString(facadeEmployees.getEmployeeVacationList());
    }

    @CrossOrigin
    @SneakyThrows
    @PostMapping("/employees/add")
    public String addEmployee(@RequestBody String employee) {
                return facadeEmployees.
                        addEmployee(objectMapper.readValue(employee, Employee.class));
    }

    @CrossOrigin
    @SneakyThrows
    @PostMapping("/authorisation")
    public String getAuthorisation(@RequestBody String loginPassword) {
        return objectMapper.writeValueAsString(facadeEmployees
                .getAuthorisation(objectMapper.readValue(loginPassword, Authorisation.class)));
    }

}
