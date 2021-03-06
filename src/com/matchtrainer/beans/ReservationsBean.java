package com.matchtrainer.beans;

import com.matchtrainer.models.Customer;
import com.matchtrainer.models.MatchTrainerService;
import com.matchtrainer.models.Reservation;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Named
@SessionScoped
public class ReservationsBean implements Serializable {
    private MatchTrainerService service;
    private Reservation reservation;
    private int visitorId;

    public ReservationsBean(){
        service = new MatchTrainerService();
    }

    public List<Reservation> getReservations(){
        visitorId = 4;
        return service.findAllReservationsByVisitor(visitorId);
    }
    public List<Reservation> getClient(){
        return service.findAllRequestsByClient(2);
    }


    public Reservation getReservation(){return reservation; }

    public void setReservation(Reservation reservation){this.reservation = reservation;}


   public int getId(){return this.getReservation().getId();}
   public void setId(int id){this.getReservation().setId(id);}
   public int getTrainerId(){return this.getReservation().getTrainerId();}
   public void setTrainerId(int trainerId){this.getReservation().setTrainerId(trainerId);}
   public String getFirstName(){return this.getReservation().getFirstName();}
   public void setFirstName(String firstName){this.getReservation().setFirstName(firstName);}
   public String getLastName(){return this.getReservation().getLastName();}
   public void setLastName(String lastName){this.getReservation().setLastName(lastName);}
   public int getVisitorId(){return this.getReservation().getVisitorId();}
   public void setVisitorId(int visitorId){this.getReservation().setVisitorId(visitorId);}
   public String getTrainingPurpose(){return this.getReservation().getTrainingPurpose();}
   public void setTrainingPurpose(String  trainingPurpose){this.getReservation().setTrainingPurpose(trainingPurpose);}
   public String getTrainingLevel(){return this.getReservation().getTrainingLevel();}
   public void setTrainingLevel(String trainingLevel){this.getReservation().setTrainingLevel(trainingLevel);}
   public String getTrainingPlace(){return this.getReservation().getTraininPlace();}
   public void setTrainingPlace(String trainingPlace){this.getReservation().setTraininPlace(trainingPlace);}
   public Date getMeetingDate(){return this.getReservation().getMeetingDate();}
   public void setMeetingDate(Date meetingDate){this.getReservation().setMeetingDate(meetingDate);}
   public String getAddress(){return this.getReservation().getAddress();}
   public void setAddress(String address){this.getReservation().setAddress(address);}
   public String getHour(){return this.getReservation().getHour();}
   public void setHour(String hour){this.getReservation().setHour(hour);}
   public String getState(){return this.getReservation().getState();}
   public void setState(String state){this.getReservation().setState(state);}
   public String getCommentary(){return this.getReservation().getCommentary();}
   public void setCommentary(String commentary){this.getReservation().setCommentary(commentary);}
   public boolean isEnable(){return this.getReservation().isEnabled();}
   public void setEnable(boolean enable){this.getReservation().setEnabled(enable);}
   public String getPhotoname(){return this.getReservation().getPhotoname();}
   public void setPhotoname(String photoname){this.getReservation().setPhotoname(photoname);}
   public String getPhotourl(){return this.getReservation().getPhotourl();}
   public void setPhotourl(String photourl){this.getReservation().setPhotourl(photourl);}


   public String viewReservation(Reservation reservation){
        this.setReservation( reservation);
        return "success";
    }
    public String returnReservation(){
        return "success";
    }
    public String viewPayReservation(){
        return "success";
    }
    public String viewDenyReservation(){

        return "success";
    }

    public String updateReservationState(){
        service.updateState(this.getReservation());
        return "success";
    }
    public String updateReservationCommentary(){
        service.updateCommentary(this.getReservation());
        return "success";
    }
}
