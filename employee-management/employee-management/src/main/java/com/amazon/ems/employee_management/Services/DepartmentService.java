package com.amazon.ems.employee_management.Services;


import com.amazon.ems.employee_management.Entityy.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartmentService {
    List<Employee> getEmployee(Long did);

    List<String> getEmployeeNames(Long did);
}
