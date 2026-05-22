package com.amazon.ems.employee_management.Controller;


import com.amazon.ems.employee_management.Entityy.Employee;
import com.amazon.ems.employee_management.Entityy.EmployeeDTO1;
import com.amazon.ems.employee_management.Services.EmployeeService;
import com.amazon.ems.employee_management.Structures.ApiResponse;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService es;

    public EmployeeController(EmployeeService es) {
        this.es = es;
    }


    @PostMapping
    public Employee insertEmployeee(@RequestBody Employee e) {

        return es.insertEmployee(e);
    }

    @PutMapping("/{eid}")

    public Employee updateEmployee(@RequestBody Employee e, @PathVariable Long eid) {
        return es.updateEmployee(e,eid);
    }

    @DeleteMapping("/{eid}")
    public String deleteEmployee(@PathVariable Long eid) {
        return es.deleteEmployee(eid);
    }

    @GetMapping("pages")
    public Page<Employee> getAll(@RequestParam(defaultValue="0")  int page, @RequestParam(defaultValue="3") int size,@RequestParam String sortBy) {
        return es.getAllEmployeesByPaging(page,size,sortBy);
    }

    @GetMapping("pagesbykeyword")
    public Page<Employee> getAllBykeyword(@RequestParam String keyword,@RequestParam(defaultValue="0")  int page, @RequestParam(defaultValue="3") int size,@RequestParam String sortBy) {
        return es.getAllEmployeesByPagingKeyword(keyword,page,size,sortBy);
    }

    @GetMapping("/{id}")
    public EmployeeDTO1 getEmployeeByIdWithDTO(@PathVariable Long id) {
        return es.getEmployeeByIdWithDTO(id);
    }

    @GetMapping("/structured/{id}")
    public ResponseEntity<ApiResponse<EmployeeDTO1>> getEmployeeByStructure(@PathVariable Long id) {
        EmployeeDTO1 emp=es.getEmployeekadto(id);

        ApiResponse<EmployeeDTO1> response=new ApiResponse<>("success","fetched",emp);
        return new ResponseEntity<>(response,HttpStatus.OK);

    }

}
