package org.zaidism.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.zaidism.dto.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.CREATED)
  public Employee saveEmployee(@RequestBody @Valid  Employee employee) {
    return employee;
  }
}
