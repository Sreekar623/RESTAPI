package com.sreekar.RESTAPI.controller;

import java.util.*;

import com.sreekar.RESTAPI.entities.Department;
import com.sreekar.RESTAPI.services.Departmentservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class HelloController {

    @Autowired
    private Departmentservice ds;

    private static final Logger lg =
            LoggerFactory.getLogger(HelloController.class);

    @Value("${welmsg}")
    String msg;

    @GetMapping()
    public String verifyValue() {
        return msg;
    }

    @PostMapping()
    public Department saveDepartment(@RequestBody Department d) {
        return ds.savedept(d);
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable("id") int idd) {
        return ds.getbyid(idd);
    }

    @PutMapping("/{id}")
    public Department updateDeptById(
            @PathVariable int id,
            @RequestBody Department d
    ) {
        return ds.updatedept(id, d);
    }

    @GetMapping("/name/{name}")
    public Department getDepartmentByName(
            @PathVariable("name") String idd
    ) {
        return ds.getbyname(idd);
    }
}
