package com.repository;

import com.entity.FacebookAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacebpokAdderssRepository extends JpaRepository<FacebookAddress, Integer> {
}
