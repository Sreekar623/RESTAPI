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
@Embeddable
@AttributeOverrides({

       @AttributeOverride(
                name="name",
               column=@Column(name="guardian_name")
       ),
        @AttributeOverride(
                 name="email",
                column=@Column(name="email")
        ),
        @AttributeOverride(
                 name="ph.no",
                 column=@Column(name="mobile")
        )

})




public class Guardian {
 private String name;
 private String email;
 private String phNo;

}
