package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.instaUser;
@Repository
public interface InstaUserRepository extends JpaRepository<instaUser, Integer>{

}
