package com.sreekar.RESTAPI.services;

import com.sreekar.RESTAPI.entities.Department;
import com.sreekar.RESTAPI.repository.DeptrepoINT;
import com.sreekar.RESTAPI.repository.deptrepo;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ServiceUnitTest {

    @MockBean
    private DeptrepoINT dr;
    @Autowired
    Departmentservice ds;




    @BeforeEach
    void setUp() {
        Department d=Department.builder()
                .did(1)
                .deptname("Department 1")
                .deptaddress("golden")
                .deptcode("12").build();


        Mockito.when(dr.findById(1)).thenReturn(Optional.of(d));


    }
    @AfterEach
    void tearDown() {
        System.out.println("success");
    }

    @Test
    @DisplayName("REPORT-1")
    @Disabled
    void getbyidtest() {
        String name="Department 1";
        Department dd=ds.getbyid(1);
        assertEquals(1,dd.getDid());


    }

    @Test
    void updatedept() {
    }
}