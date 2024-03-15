package org.zaidism.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zaidism.configuration.Provider;
import org.zaidism.dto.Employee;

import java.util.List;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class EmployeeService {

  private final Provider provider;

  @Transactional(readOnly = true)
  public List<Employee> getAllEmployees() {
    log.info("fetching all employee.");
    return provider.fetchEmployeesFromDB();
  }

  public void deleteEmployeeById(Integer employeeId) {
    log.info("deleting employee with id {}", employeeId);
    provider.deleteEmployeeFromDB(employeeId);
  }

  public Employee saveEmployee(Employee employee) {
    log.info("saving employee {}", employee);
    return provider.saveEmployeeToDB(employee);
  }
}
