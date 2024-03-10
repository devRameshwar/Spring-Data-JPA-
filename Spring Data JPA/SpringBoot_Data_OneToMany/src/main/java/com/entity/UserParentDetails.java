package com.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserParentDetails {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer parentId;
    @Column
    private String fatherName;
    @Column
    private String motherName;

}
