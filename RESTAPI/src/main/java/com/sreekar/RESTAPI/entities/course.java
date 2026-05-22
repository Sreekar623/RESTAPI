package com.sreekar.RESTAPI.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class course {
    @Id
    private String cid;
    private String cname;

    @OneToOne(mappedBy="course",cascade= CascadeType.ALL)  //so basically hib gets idea, we can store both at a time optional
    private coursematerial cm;
}
