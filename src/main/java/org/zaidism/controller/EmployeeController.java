package org.zaidism.controller;

import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.zaidism.dto.Employee;
import org.zaidism.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

  private final EmployeeService employeeService;

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.CREATED)
  public Employee saveEmployee(@RequestBody @Valid Employee employee) {
    return employeeService.saveEmployee(employee);
  }

  @GetMapping("/")
  @ResponseStatus(HttpStatus.OK)
  public List<Employee> getAllEmployees() {
    return employeeService.getAllEmployees();
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteEmployeeById(@PathVariable Integer id) {
    employeeService.deleteEmployeeById(id);
  }
}
