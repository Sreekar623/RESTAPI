package com.sreekar.RESTAPI.controller;


import java.util.*;

import com.sreekar.RESTAPI.entities.Department;
import com.sreekar.RESTAPI.services.Departmentservice;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class HelloController {
    @Autowired
    private Departmentservice ds;


    private static final Logger lg= LoggerFactory.getLogger(HelloController.class);

@Value("${welmsg}")
String msg;

 @GetMapping()
 public String utthhh(){
      return msg;
 }


    @PostMapping()
    public Department puts(@RequestBody Department d) {
        return ds.savedept(d);
    }
    @GetMapping("/sohana/details")
    public String getss(){
        return "SHE IS GAY";
    }
        @GetMapping("/{id}")
        public Department getss(@PathVariable("id") int idd){

            return ds.getbyid(idd);
        }
        @PutMapping("/{id}")
         public Department updatedept(@PathVariable int id, @RequestBody Department d){
              return ds.updatedept(id,d);

            }

    @GetMapping("name/{name}")
    public Department getss(@PathVariable("name") String idd){

        return ds.getbyname(idd);
    }






}
