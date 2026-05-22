package com.sreekar.RESTAPI.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class coursematerial {

    @Id
    private String cmid;
    private String cmname;

    @OneToOne(cascade= CascadeType.ALL,fetch = FetchType.EAGER,optional=false)
    @JoinColumn(name="course_id_incm",referencedColumnName="cid")
    private course course;
}
