package com.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@ToString
@Table(name = "facebook_user")
public class FacebookUser {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column
    private String userName;
    @Column
    private String email;
    @Column
    private String mobileNumber;

    @OneToOne(cascade = CascadeType.ALL)
    UserParentDetails parentDetails;

    @OneToMany(mappedBy = "facebookUser",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List <FacebookAddress> address;


}
