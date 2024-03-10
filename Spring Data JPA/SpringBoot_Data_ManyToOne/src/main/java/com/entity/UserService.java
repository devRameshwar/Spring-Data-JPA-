package com.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "google_user_service")
public class UserService {

    @Id
    @Column
    @GeneratedValue()
    private Integer serviceId;
    @Column
    private String serviceName;
    @Column
    private String serviceType;

   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition = "google_user_id")
    private  GoogleUser googleUser;*/


}
