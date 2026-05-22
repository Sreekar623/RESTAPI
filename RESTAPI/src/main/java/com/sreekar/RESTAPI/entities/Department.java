package com.sreekar.RESTAPI.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;



@Entity
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
 @Id
 @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int did;
 private String deptname;
 private String deptaddress;
 private String deptcode;
}
