package com.service;
import com.entity.GoogleUser;
import com.entity.UserService;
import com.repository.GoogleUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationService {

    @Autowired
    private GoogleUserRepository repository;

    public void insertData() {
        //creating UserService Object
        UserService service = new UserService();
        service.setServiceName("GOOGLE SHEET");
        service.setServiceType("Full-service");

        //creating multiple userList
        ArrayList<GoogleUser> googleUserList = new ArrayList<>();
        googleUserList.add(new GoogleUser(111, "Anupam Singh", "anupam@gmail.com", "987671456", service));
        googleUserList.add(new GoogleUser(112, "Radhika Varma", "adhila@gmail.com", "876565456", service));
        //googleUserList.add(new GoogleUser(104, "Saurabh Singh", "saurabh@gmail.com", "1239765456", service));

        //calling GoogleUserRepository  repository methods to save data
        this.repository.saveAll(googleUserList);

    }
    //delete data from Table
    public void deleteDataFromTable(){
        this.repository.deleteById(107);
        System.out.println("User deleted successfully...........");
    }
    //getting Data
    public void getAllUserAndServiceData(){
        List<GoogleUser> googleUserList = this.repository.findAll();
        googleUserList.forEach(System.out::println);
    }
}
