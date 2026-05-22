package com.sreekar.RESTAPI.repository;

import com.sreekar.RESTAPI.entities.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StdRepo extends JpaRepository<Student, Integer> {
    public Student findByFname(String s);
    @Query("select s FROM Student s where s.fname=?1")
    Student getStudentByFname(String e);

    @Query(value="SELECT * FROM studentkatable ", nativeQuery=true)
public List<Student> getallrowsbynative();

    @Modifying
    @Transactional
    @Query(value="update studentkatable set fname = ?1 where fname='gud'",nativeQuery=true)
    public int updatewithqueriesroi(String p1);



}