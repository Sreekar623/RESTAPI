package com.amazon.ems.employee_management.Entityy;

import com.amazon.ems.employee_management.Repositories.DepartmentRepository;
import com.amazon.ems.employee_management.Repositories.EmployeeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeTest {

    @Autowired
    private EmployeeRepository er;

    @Autowired
    private DepartmentRepository dr;




    @Test
    @DisplayName("repoport-1")
    void saveempwithdept() {
        Department d=Department.builder().name("cse").build();
        Employee e1=Employee.builder().name("subramaniam").department(d).build();
        Employee e2=Employee.builder().name("nagaraju").department(d).build();

        ArrayList<Employee> elist=new ArrayList<Employee>();
        elist.add(e1);
        elist.add(e2);

        er.saveAll(elist);





    }


}