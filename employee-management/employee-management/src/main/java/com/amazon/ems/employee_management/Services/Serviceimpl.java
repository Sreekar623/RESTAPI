package com.amazon.ems.employee_management.Services;


import com.amazon.ems.employee_management.Entityy.Department;
import com.amazon.ems.employee_management.Entityy.Employee;
import com.amazon.ems.employee_management.Entityy.EmployeeDTO1;
import com.amazon.ems.employee_management.Repositories.DepartmentRepository;
import com.amazon.ems.employee_management.Repositories.EmployeeRepository;
import com.amazon.ems.employee_management.Structures.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class Serviceimpl implements EmployeeService {

    private EmployeeRepository er;
    private DepartmentRepository dr;




    public Serviceimpl(DepartmentRepository dr, EmployeeRepository er) {
        this.dr = dr;
        this.er = er;
    }


    @Override
    public Employee insertEmployee(Employee e){

        Department d=dr.findById(e.getDepartment().getId()).orElseThrow();
        e.setDepartment(d);

        return er.save(e);

    }

    @Override
    public Employee updateEmployee(Employee e, @PathVariable Long eid) {
        Employee existing=er.findById(eid).orElse(null);
        if(e.getName()!=null){
            existing.setName(e.getName());
        }

        if(e.getDepartment()!=null && e.getDepartment().getId()!=null){
            existing.setDepartment(e.getDepartment());
        }
      return  er.save(existing);


    }

    @Override
    public String deleteEmployee(@PathVariable Long eid) {

        Employee e=er.findById(eid).orElseThrow();

        er.delete(e);
        return "deleted successfully";
    }

    @Override
    public Page<Employee> getAllEmployeesByPaging(int page, int size, String sortBy) {
        Pageable p= PageRequest.of(page,size, Sort.by(sortBy));
        return er.findAll(p);
    }

    @Override
    public Page<Employee> getAllEmployeesByPagingKeyword(String keyword, int page, int size, String sortBy) {

        return er.findByNameContainingIgnoreCase(keyword, PageRequest.of(page,size, Sort.by(sortBy)));
    }

    @Override
    public EmployeeDTO1 getEmployeeByIdWithDTO(Long id) {
        Employee e=er.findById(id).orElseThrow();
        EmployeeDTO1 dto1=new EmployeeDTO1();
        dto1.setId(e.getId());
        dto1.setDeptName(e.getDepartment().getName());
        return dto1;
    }

    @Override
    public EmployeeDTO1 getEmployeekadto(Long id) {
        Employee e=er.findById(id).orElseThrow();
        EmployeeDTO1 dto1=new EmployeeDTO1();
        dto1.setId(e.getId());
        dto1.setDeptName(e.getDepartment().getName());

      return dto1;
    }


}
