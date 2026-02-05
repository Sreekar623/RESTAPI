package com.sreekar.RESTAPI.repository;

import com.sreekar.RESTAPI.entities.course;
import com.sreekar.RESTAPI.entities.coursematerial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class coursematerialrepoTest{
    @Autowired
    private coursematerialrepo coursematerialrepo;

    @Test
    @DisplayName("Report-1")
    public void savewithcourse(){
        course c=course.builder().
                cid("1").cname("JAVA").build();

        coursematerial cm=coursematerial.builder().
                cmid("1").cmname("JAVA.pdf").course(c).build();

    }


}