package com.matchtrainer.beans;

import com.matchtrainer.models.Customer;
import com.matchtrainer.models.District;
import com.matchtrainer.models.MatchTrainerService;
import com.matchtrainer.models.User;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;


@Named
@SessionScoped
public class CustomersBean implements Serializable{
    private MatchTrainerService service;
    private Customer customer;


    public CustomersBean(){
        service = new MatchTrainerService();
    }
/*
*  public List<Customer> getCustomersByTrainer(){
        return service.findAllCustomers();
    }*/

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getUserId(){
        return this.getCustomer().getUserId();
    }

    public void setUserId(int userId){
        this.getCustomer().setUserId(userId);
    }

    public int getDistrictId(){
        return this.getCustomer().getDistrictId();
    }

    public void setDistrictId(int districtId){
        this.getCustomer().setDistrictId(districtId);
    }

    public String getFirstName(){
        return this.getCustomer().getFirstName();
    }

    public void setFirstName(String firstName){
        this.getCustomer().setFirstName(firstName);
    }

    public  String getLastName(){
        return  this.getCustomer().getLastName();
    }

    public void setLastName(String lastName){
        this.getCustomer().setLastName(lastName);
    }

    public  String getPhotoName(){
        return  this.getCustomer().getPhotoName();
    }

    public void setPhotoName(String photoName){
        this.getCustomer().setPhotoName(photoName);
    }

    public  String getPhotoUrl(){
        return  this.getCustomer().getPhotoUrl();
    }

    public void setPhotoUrl(String photoUrl){
        this.getCustomer().setPhotoUrl(photoUrl);
    }

    public  String getGender(){
        return  this.getCustomer().getGender();
    }

    public void setGender(String gender){
        this.getCustomer().setGender(gender);
    }

    public  int getAge(){
        return  this.getCustomer().getAge();
    }

    public void setAge(int age){
        this.getCustomer().setAge(age);
    }

    public Date getRegistrationDate(){
        return  this.getCustomer().getRegistrationDate();
    }

    public void setRegistrationDate(Date registrationDate){
        this.getCustomer().setRegistrationDate(registrationDate);
    }

    public String newCustomer(){
        this.setCustomer(new Customer());
        return "success";
    }

    public String createCustomer(){
        /*   UsersBean usersBean = new UsersBean();
        User user =usersBean.createUser();
        if (user!= null ) {
            this.getCustomer().setUserId(user.getId());
            service.createCustomer(this.getCustomer());
            return "success";
        }else{
            return  "error";
        }*/

            return  "error";

    }


    /*
    public String editCustomer(Customer region){
        this.setCustomer(region);
        return "success";
    }

    public String updateCustomer(){
        service.updateCustomer(this.getCustomer());
        return "success";
    }

    public String deleteCustomer(Customer customer){
        service.deleteCustomer(customer.getId());
        return "success";
    }
    */
}
