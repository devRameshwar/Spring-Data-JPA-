package com.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.entity.UserTable;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<UserTable, Integer> {

	// Native Select Query

	@Query(value = "SELECT * FROM USER_Table", nativeQuery = true)
	List<UserTable> getAllUser();

	// native Query getting user by email
	@Query(value = "SELECT * FROM USER_Table where email=?1", nativeQuery = true)
	UserTable getUserByEmail(String email);

	// Update email using native query
	@Modifying
	@Query(value = "UPDATE USER_Table SET email = ?1 WHERE email = ?2", nativeQuery = true)
	int updateEmail(String newEmail, String oldEmail);

	// update name And mobile number using native query
	@Modifying
	@Query(value = "UPDATE USER_Table SET name =?1,mobile_number=?2 WHERE NAME=?3 ", nativeQuery = true)
	int updateNameAndMobileNumber(String newName, String newMobileNumber, String oldName);

	// native Query with named based parameter
	@Query(value = "SELECT * FROM USER_Table where email=:email", nativeQuery = true)
	UserTable grtUserByMail(@Param("email") String email);

}
