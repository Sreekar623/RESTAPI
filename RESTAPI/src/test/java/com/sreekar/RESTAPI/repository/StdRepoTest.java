package com.sreekar.RESTAPI.repository;

import com.sreekar.RESTAPI.entities.Guardian;
import com.sreekar.RESTAPI.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StdRepoTest {

    @Autowired
    StdRepo sr;

    @Test
    public void method1(){
        Student s = Student.builder()
                        .fname("gud")
                                .emailId("ssss").build();
        sr.save(s);
    }

    @Test
    public void embeddcheck(){
        Guardian g=Guardian.builder().name("g1").build();
         Student s=Student.builder().fname("gudddd").g(g).build();
         sr.save(s);
    }

    @Test
    public void extremethod(){
         Student s=sr.findByFname("gud");
         System.out.println(s);
    }

    @Test
    public void throughjpqlCUSTOMQUERYMETHOD(){
        Student s=sr.getStudentByFname("gud");
        System.out.println(s);
    }

     @Test
    public void throughnaturalCUSTOMQUERYMETHOD(){
         List<Student> s=sr.getallrowsbynative();
         System.out.println(s);
     }

      @Test
      public void updaterr(){
        sr.updatewithqueriesroi("bad");
      }


}