package org.test.listofvacation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.listofvacation.dto.EmployeeDataProvider;

import java.util.List;

@RestController
public class AppController {

    @GetMapping("/employees")
    public EmployeeDataProvider getEmployeesList() {
        return null;
    }
}
