package com.sreekar.RESTAPI.repository;

import com.sreekar.RESTAPI.entities.course;
import com.sreekar.RESTAPI.entities.coursematerial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class courserepoTest {

    @Autowired
    courserepo cr;

    @Test
    void saveCoursewithoutcascadeORwithcascadeOPTIONALFALSE() {
        course c=course.builder().cid("1").build();
        cr.save(c);
    }
    @Test
    void saveCoursewithcascade() {

 coursematerial cm= coursematerial.builder().cmid("10").build();

        course c=course.builder().cid("10").cm(cm).build();
        cm.setCourse(c);
        cr.save(c);

    }


}