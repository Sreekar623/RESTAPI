package com.amazon.ems.employee_management.Controller;


import com.amazon.ems.employee_management.Entityy.Department;
import com.amazon.ems.employee_management.Entityy.Employee;
import com.amazon.ems.employee_management.Repositories.DepartmentRepository;

import com.amazon.ems.employee_management.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService ds;

    @Autowired
    private DepartmentRepository dr;


    @PostMapping
    Department savedept(@RequestBody Department d) {
        return dr.save(d);
    }

        @GetMapping("/employees/{did}")
        public List<Employee> getEmployee(@PathVariable Long did) {
            return ds.getEmployee(did);
        }

        @GetMapping("/employeesnames/{did}")
        public List<String> getEmployeeNames(@PathVariable Long did){
                return ds.getEmployeeNames(did);

            }




}
