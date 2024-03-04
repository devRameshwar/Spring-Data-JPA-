package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.UserTable;
import com.repository.UserRepository;

@Component
public class UserService {

	@Autowired
	private UserRepository repository;

	// Save User Data Using Custom Query
	public void saveUserData() {
		UserTable user = new UserTable();
		user.setUserName("Golu Singh");
		user.setEmail("golu@gmail.com");
		user.setMobileNumber("0987564327");
		repository.save(user);
		System.out.println("User Data Inserted....");
	}

	// getting all User Data using Native Query...
	public void getAllDeta() {
		List<UserTable> allUser = repository.getAllUser();
		allUser.forEach(System.out::println);
	}

	// getting User Data by email using Native Query...
	public void gettingUserByEmail() {
		UserTable userByEmail = repository.getUserByEmail("sivi@gmail.com");
		System.out.println(userByEmail);
	}

	// Update email with native query
	public void upadateEmail() {
		int updateEmail = repository.updateEmail("golu123@gmail.com", "golu@gmail.com");
		if (updateEmail > 0) {
			System.out.println("Email updated...");
		} else {
			System.out.println("Something went wrong....");
		}
	}

	// calling update name And mobile number using native query
	public void updateNameAndMobileNumber() {
		int updateNameAndMobileNumber = repository.updateNameAndMobileNumber("Syam Singh", "9889786545", "Golu Singh");
		if (updateNameAndMobileNumber > 0) {
			System.out.println("Name And MobileNumber updated...");
		} else {
			System.out.println("Something went wrong....");
		}
	}
	// Update email with native with name parameter query
	public void getUserByemail() {
		UserTable grtUserByMail = repository.grtUserByMail("golu123@gmail.com");
		System.out.println(grtUserByMail);
	}
	
}
