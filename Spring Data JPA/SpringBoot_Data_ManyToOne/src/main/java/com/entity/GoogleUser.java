package com.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "google_user")
public class GoogleUser {
    @Id
    @Column
    private Integer userId;
    @Column
    private String userName;
    @Column
    private String email;
    @Column
    private String mobileNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition = "google_service_id")
    private UserService service;
}
