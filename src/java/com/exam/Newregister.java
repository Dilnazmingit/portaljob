package com.exam;
// Generated Mar 22, 2019 1:58:40 AM by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;




/**
 * Newregister generated by hbm2java
 */
@ManagedBean
@SessionScoped
public class Newregister  implements java.io.Serializable {
private List<Newregister>list= new ArrayList<>();

     private int id;
     private String name;
     private String email;
     private String password;
     private String currentLocation;
     private String gender;
     private String dob;
     private String mobile;

    public Newregister() {
    }

	
    public Newregister(int id) {
        this.id = id;
    }
    public Newregister(int id, String name, String email, String password, String currentLocation, String gender, String dob, String mobile) {
       this.id = id;
       this.name = name;
       this.email = email;
       this.password = password;
       this.currentLocation = currentLocation;
       this.gender = gender;
       this.dob = dob;
       this.mobile = mobile;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCurrentLocation() {
        return this.currentLocation;
    }
    
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDob() {
        return this.dob;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



public String dosave(){
  NewregisterDao  ds=new NewregisterDao ();
    ds.dosave(this);
return "success";

}


public String update(){
  NewregisterDao  ds=new NewregisterDao ();
    ds.update(this);
return "success2";

}

public String delete(){
  NewregisterDao  ds=new NewregisterDao ();
    ds.delete(this);
return "success1";

}

    public List<Newregister> getList() {
        NewregisterDao  d=new NewregisterDao ();
    list=d.show();
        return list;
    }

    public void setList(List<Newregister> list) {
        this.list = list;
    }


}


