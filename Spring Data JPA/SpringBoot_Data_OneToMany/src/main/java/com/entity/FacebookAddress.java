package com.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FacebookAddress {

    @Id
    @Column
    private Integer addressId;
    @Column
    private String city;
    @Column
    private String district;
    @Column
    private String pincode;
    @Column
    private String State;
    @Column
    private String country;

    @ManyToOne
    @JoinColumn(columnDefinition= "user_address_id")
    private FacebookUser facebookUser;

}
