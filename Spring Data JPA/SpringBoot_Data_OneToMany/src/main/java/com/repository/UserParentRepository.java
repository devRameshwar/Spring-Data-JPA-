package com.repository;

import com.entity.UserParentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserParentRepository extends JpaRepository<UserParentDetails,Integer> {
}
