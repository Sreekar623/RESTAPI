package com.sreekar.RESTAPI.services;

import com.sreekar.RESTAPI.Exceptions.deptnotfound;
import com.sreekar.RESTAPI.entities.Department;
import com.sreekar.RESTAPI.repository.DeptrepoINT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class departmentserviceimpl implements Departmentservice {

    @Autowired
    private DeptrepoINT dr;

    @Override
    public Department savedept(Department d){
         return dr.save(d);
    }
    @Override
    public Department getbyid(int pv){
         Optional<Department> dd=dr.findById(pv);
         if(!dd.isPresent()){
              throw new deptnotfound("add it ");
         }
  return dd.get();
    }
    @Override
    public Department updatedept(int pv,Department d){
        Department ff=dr.findById(pv).orElse(null);
        if (Objects.nonNull(d.getDeptname())
                && !"".equalsIgnoreCase(d.getDeptname())){
            ff.setDeptname(d.getDeptname());
        }
        return dr.save(ff);


    }
    @Override
    public Department getbyname(String s){
         return dr.findBydeptname(s);
    }


}

