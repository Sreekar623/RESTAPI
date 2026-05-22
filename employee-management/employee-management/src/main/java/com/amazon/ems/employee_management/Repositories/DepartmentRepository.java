package com.amazon.ems.employee_management.Repositories;

import com.amazon.ems.employee_management.Entityy.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
