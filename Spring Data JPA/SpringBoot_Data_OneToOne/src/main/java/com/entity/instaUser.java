package com.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "inta_user")
public class instaUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer userId;

    @Column
    private String userName;

    @Column
    private String email;

    @Column
    private String mobileNumber;

    // Write join logic ontToOne
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition = "userAndAddressId")
    private InstaUserAddress instaUserAddress;

}
