package com.server.app.barber;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@Document(collection = "barbers")
public class barber {

    @Id
    private String id;

    @Getter
    private String name;
    @Getter
    private String number;
    @Getter
    private String email;
    @Getter
    private String username;
    @Getter
    private String password;
    @Getter
    private String firstname;
    @Getter
    private String lastname;
    @Getter
    private List<String> times;
    @Getter
    private String openTime;
    @Getter
    private String closeTime;
    @Getter
    private List<String> breakDays;
    @Getter
    private List<String> hardDates;
    @Getter
    private String location;
    @Getter
    private String googleDriveImigUrl;
    @Getter
    private boolean normalPlan;
    @Getter
    private boolean reservationPlan;
    @Getter
    private boolean analysisPlan;
    @Getter
    private String planEndDate;
    @Getter
    private String rating;


    public barber( ) {
        super();
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void  setLastname(String lastname){
        this.lastname = lastname;
    }
    public  void setTimes(List<String> times){
        this.times = times;
    }
    public void setOpenTime(String openTime){
        this.openTime = openTime;
    }
    public void setCloseTime(String closeTime){
        this.closeTime = closeTime;
    }
    public void setBreakDays(List<String> breakDays){
        this.breakDays = breakDays;
    }
    public void setHardDates(List<String> hardDates){
        this.hardDates = hardDates;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setGoogleDriveImigUrl(String googleDriveImigUrl){
        this.googleDriveImigUrl = googleDriveImigUrl;
    }
    public void setNormalPlan(boolean normalPlan){
        this.normalPlan = normalPlan;
    }
    public void setReservationPlan(boolean reservationPlan){
        this.reservationPlan = reservationPlan;
    }
    public void setAnalysisPlan(boolean analysisPlan){
        this.analysisPlan = analysisPlan;
    }
    public void setPlanEndDate(String planEndDate){
        this.planEndDate = planEndDate;
    }
    public void setRating(String rating){
        this.rating = rating;
    }
}

