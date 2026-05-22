package com.sreekar.RESTAPI.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="STUDENTKATABLE",
        uniqueConstraints =@UniqueConstraint(
       name="constrai_fnam_lname",
       columnNames={"fname","lname"}
        )
)


public class Student {
    @Id

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int sid;
    private String fname;
    private String lname;
    @Column(name="emailll",unique=true)
    private String emailId;
    @Embedded
    private Guardian g;
}
