package com.amazon.ems.employee_management.Services;

import com.amazon.ems.employee_management.Entityy.Department;


import com.amazon.ems.employee_management.Entityy.Employee;
import com.amazon.ems.employee_management.Exception.DepartmentNotFoundException;
import com.amazon.ems.employee_management.Repositories.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class deptserviceimpl implements DepartmentService {
    private static final Logger lg= LoggerFactory.getLogger(DepartmentService.class);
    @Autowired
    private DepartmentRepository dr;


    @Override
    public List<Employee> getEmployee(Long did) {
        lg.info("trying to fetch with id: ",did);
        Department d = dr.findById(did).orElseThrow(() ->{ lg.error("Department not found:{}",did);
        return new DepartmentNotFoundException("add it");}
        );


        return d.getEmployees();

    }
@Override
    public List<String> getEmployeeNames(Long did) {
        Department d = dr.findById(did).orElseThrow(() -> new RuntimeException("department not found"));
    List<String> employeeNames = new ArrayList<>();
       List<Employee> Employees= d.getEmployees();
       for(Employee e:Employees){
           employeeNames.add(e.getName());
       }
       return employeeNames;

    }
}
