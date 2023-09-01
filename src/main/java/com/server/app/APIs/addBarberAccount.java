package com.server.app.APIs;

import com.server.app.repository.barberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.server.app.barber.barber;

@RestController
@RequestMapping("/createAccount")
public class addBarberAccount {

    @Autowired
    barberRepository barberRepository;
    @PostMapping("/barber")
    public ResponseEntity<String> createUser(@RequestBody barber barber) {
        try {
            if (barberRepository.existsByEmail(barber.getEmail())) {
                return ResponseEntity.badRequest().body("the email already exist");
            } else if (barberRepository.existsByUsername(barber.getUsername())) {
                return ResponseEntity.badRequest().body("the username already exist");
            }
            barberRepository.save(barber);
            System.out.println("************ the account created *************");
            System.out.println("************ account details     *************");
            if (barber.getName() != null){
                System.out.println("name  :  " + barber.getName());
            } else {
                System.out.println("name  :  the user don't add any think about this");
            }
            if (barber.getNumber() != null){
                System.out.println("number  :  " + barber.getNumber());
            } else {
                System.out.println("number  :  the user don't add any think about this");
            }
            if (barber.getEmail() != null){
                System.out.println("email  :  " + barber.getEmail());
            } else {
                System.out.println("email  :  the user don't add any think about this");
            }
            if (barber.getUsername() != null){
                System.out.println("username  :  " + barber.getUsername());
            } else {
                System.out.println("username  :  the user don't add any think about this");
            }
            if (barber.getPassword() != null){
                System.out.println("password  :  " + barber.getPassword());
            } else {
                System.out.println("password  :  the user don't add any think about this");
            }
            if (barber.getFirstname() != null){
                System.out.println("first name  :  " + barber.getFirstname());
            } else {
                System.out.println("first name  :  the user don't add any think about this");
            }
            if (barber.getLastname() != null){
                System.out.println("last name  :  " + barber.getLastname());
            } else {
                System.out.println("last name  :  the user don't add any think about this");
            }
            if (barber.getTimes() != null){
                System.out.println("times  :  [");
                for (String item : barber.getTimes()){
                    System.out.println("        " + item + ",");
                }
                System.out.println("]");
            } else {
                System.out.println("times  :  the user don't add any think about this");
            }
            if (barber.getOpenTime() != null){
                System.out.println("open times  :  " + barber.getOpenTime());
            } else {
                System.out.println("open times  :  the user don't add any think about this");
            }
            if (barber.getCloseTime() != null){
                System.out.println("close times  :  " + barber.getCloseTime());
            } else {
                System.out.println("close times  :  the user don't add any think about this");
            }
            if (barber.getBreakDays() != null){
                System.out.println("break days  :  [");
                for (String item : barber.getBreakDays()){
                    System.out.println("             " + item + ",");
                    System.out.println("]");
                }
            } else {
                System.out.println("break days  :  the user don't add any think about this");
            }
            if (barber.getHardDates() != null){
                System.out.println("hard dates  :  [");
                for (String item : barber.getHardDates()){
                    System.out.println("             " + item + ",");
                    System.out.println("]");
                }
            } else {
                System.out.println("hard dates  :  the user don't add any think about this");
            }
            if (barber.getLocation() != null){
                System.out.println("location  :  " + barber.getLocation());
            } else {
                System.out.println("location  :  the user don't add any think about this");
            }
            if (barber.getGoogleDriveImigUrl() != null){
                System.out.println("google drive url image  :  " + barber.getGoogleDriveImigUrl());
            } else {
                System.out.println("google drive url image  :  the user don't add any think about this");
            }
            if (barber.isNormalPlan()){
                System.out.println("the normal plan  :  " + true);
            } else {
                System.out.println("the normal plan  :  " + false);
            }
            if (barber.isAnalysisPlan()){
                System.out.println("the analysis plan  :  " + true);
            } else {
                System.out.println("the analysis plan  :  " + false);
            }
            if (barber.isReservationPlan()){
                System.out.println("the reservation plan  :  " + true);
            } else {
                System.out.println("the reservation plan  :  " + false);
            }
            if (barber.getPlanEndDate() != null){
                System.out.println("plan end date  :  " + barber.getPlanEndDate());
            } else {
                System.out.println("plan end date  :  the user don't add any think about this");
            }
            if (barber.getRating() != null){
                System.out.println("rating  :  " + barber.getRating());
            } else {
                System.out.println("rating  :  the user don't add any think about this");
            }
            System.out.println("**********************************************");
            return ResponseEntity.ok("the account created");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("error while creating account");
        }
    }
}

