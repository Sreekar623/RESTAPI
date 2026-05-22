package com.sreekar.RESTAPI.repository;

import com.sreekar.RESTAPI.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptrepoINT extends JpaRepository<Department,Integer> {

    public Department findBydeptname(String deptname);
}
