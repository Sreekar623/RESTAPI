package com.sreekar.RESTAPI.repository;

import com.sreekar.RESTAPI.entities.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;


import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class DeptrepoINTTest {


    @Autowired
    DeptrepoINT dr;
    @Autowired
    TestEntityManager em;
    @BeforeEach
    void setUp() {
        Department d= Department.builder().
                deptaddress("aas")

                        .deptcode("23").build();
        em.persist(d);
    }
    @DisplayName("Report-2")
    @Test
    public void findbyiddd(){
         Department dd=dr.findById(1).get();
         assertEquals("aas",dd.getDeptaddress());
    }


}