package org.test.listofvacation.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.listofvacation.entities.Employee;
import org.test.listofvacation.facade.FacadeEmployeesService;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    FacadeEmployeesService facadeEmployeesService;

    @SneakyThrows
    @GetMapping("/employees")
    public String getEmployeesList() {
        List<Employee> list = facadeEmployeesService.getEmployeeList();
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writeValueAsString(list);
    }
}
