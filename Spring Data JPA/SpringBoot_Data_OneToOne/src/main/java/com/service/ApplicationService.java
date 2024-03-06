package com.service;
import com.entity.InstaUserAddress;
import com.entity.instaUser;
import com.repository.InstaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationService {

    @Autowired
    private InstaUserRepository repository;

    public void addDataIntoUserAndAddress(){

        //creating user class object
        instaUser user = new instaUser();

        //setting the values of fields
        user.setUserName("Deepa Singh");
        user.setEmail("deepa@gmail.com");
        user.setMobileNumber("0231675679");

        //creating Address class object
        InstaUserAddress address = new InstaUserAddress();
        //Setting the value of address class
        address.setCity("umaraha");
        address.setState("Utter-Pradesh");
        address.setDistric("Jaunpur");
        address.setPincode("221234");
        address.setCountry("INDIA");

        //setting the address field in user class
        user.setInstaUserAddress(address);

        //calling the repository method to save the data
        this.repository.save(user);

        System.out.println("user and address data saved.....");
    }
    //delete Data User And Address
    public void deleteUserAndAdddressData(){
        //delete by userId id
        repository.deleteById(1);
        System.out.println("Data is deleted....");

    }
    public void gettingAllDataitoDataBase(){
        List<instaUser> users = repository.findAll();
        // printing the users

        users.forEach(System.out::println);
    }


}
