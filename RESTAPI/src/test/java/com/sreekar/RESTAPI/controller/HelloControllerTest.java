package com.sreekar.RESTAPI.controller;

import com.sreekar.RESTAPI.entities.Department;
import com.sreekar.RESTAPI.services.Departmentservice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
class HelloControllerTest {



    @MockBean
  private  Departmentservice ds;
    @Autowired
    MockMvc mm;
    private Department d;
    @BeforeEach
    void setUp() {
         d=Department.builder()
                .deptname("IT")
                .build();

    }
@Test
    public void method1() throws Exception {
         Department dd=Department.builder()
                 .deptname("IT")
                 .build();

         Mockito.when(ds.savedept(dd)).thenReturn(d);

        mm.perform(post("/departments")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "  \"deptname\": \"IT\"\n" +
                                "}"))
                .andExpect(MockMvcResultMatchers.status().isOk());





    }
}