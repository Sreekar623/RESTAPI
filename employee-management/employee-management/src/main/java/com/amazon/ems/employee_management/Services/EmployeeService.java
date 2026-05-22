package com.amazon.ems.employee_management.Services;


import com.amazon.ems.employee_management.Entityy.Employee;
import com.amazon.ems.employee_management.Entityy.EmployeeDTO1;
import com.amazon.ems.employee_management.Structures.ApiResponse;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {
    Employee insertEmployee(Employee e);

    Employee updateEmployee(Employee e, Long eid);

    String deleteEmployee(Long eid);

    Page<Employee> getAllEmployeesByPaging(int page, int size, String sortBy);

    Page<Employee> getAllEmployeesByPagingKeyword(String keyword, int page, int size, String sortBy);

    EmployeeDTO1 getEmployeeByIdWithDTO(Long id);

    EmployeeDTO1 getEmployeekadto(Long id);
}
