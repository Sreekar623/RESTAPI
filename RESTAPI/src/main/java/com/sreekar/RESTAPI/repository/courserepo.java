package com.sreekar.RESTAPI.repository;

import com.sreekar.RESTAPI.entities.course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courserepo extends JpaRepository<course, Integer> {
}
