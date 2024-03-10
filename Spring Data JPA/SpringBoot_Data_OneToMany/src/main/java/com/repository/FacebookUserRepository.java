package com.repository;

import com.entity.FacebookUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacebookUserRepository extends JpaRepository<FacebookUser,Integer> {

    @Query("SELECT DISTINCT p FROM FacebookUser p LEFT JOIN FETCH p.address")
    List<FacebookUser> findAllWithChildren();
}
