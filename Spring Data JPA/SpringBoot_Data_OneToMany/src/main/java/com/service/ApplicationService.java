package com.service;

import com.entity.FacebookAddress;
import com.entity.FacebookUser;
import com.entity.UserParentDetails;
import com.repository.FacebookUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ApplicationService {

    @Autowired
    private FacebookUserRepository repository;

    public void insertData() {
        //creating user object
        FacebookUser user = new FacebookUser();

        //setting user fields
        user.setUserName("Amit Singh");
        user.setEmail("amit@gmail.com");
        user.setMobileNumber("913245614");

        //creating parent objects
        UserParentDetails parentDetails = new UserParentDetails();
        parentDetails.setFatherName("Lal ji");
        parentDetails.setMotherName("Seema Devi");

        //setting parents details
        user.setParentDetails(parentDetails);

        //creating Address object
        FacebookAddress address = new FacebookAddress();
        //setting Address data as a List
        List<FacebookAddress> addressList = Arrays.asList(new FacebookAddress(12, "Gnagapur", "Varanasi", "221104", "Utter-Pradesh", "INDIA",user),
                new FacebookAddress(14, "Bullnpur", "Varanasi", "221101", "UTTER-PRADESH", "INDIA",user));

        //Setting Address in employee field
        user.setAddress(addressList);

        //calling repository method to save data
        repository.save(user);

        System.out.println("Data is save successfully.....");
    }

    public void gettingAllData(){
        List<FacebookUser> facebookUserList = repository.findAllWithChildren();
        facebookUserList.forEach(System.out::println);
    }

    public void deleteById() {

        repository.deleteById(202);
        System.out.println("Data is deleted.....Successfully");
    }
}
