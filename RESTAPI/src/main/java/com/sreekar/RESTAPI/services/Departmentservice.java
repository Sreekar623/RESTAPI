package com.sreekar.RESTAPI.services;

import com.sreekar.RESTAPI.entities.Department;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface Departmentservice {
    public Department savedept(Department d);
    public Department getbyid( int pv);
    public Department updatedept(int id, Department d);
    public Department getbyname(String s);
}
