package com.matchtrainer.models;

import java.util.Date;

public class Reservation {
    private int id;
    private int trainerId;
    private int visitorId;
    private String firstName;
    private String lastName;
    private String trainingPurpose;
    private String trainingLevel;
    private String traininPlace;
    private Date meetingDate;
    private String address;
    private String hour;
    private String state;
    private String commentary;
    private boolean enabled;
    private String photoname;
    private String photourl;

    public Reservation() {

    }

    public Reservation(int id, int trainerId, int visitorId, String firstName, String lastName, String trainingPurpose, String trainingLevel, String traininPlace, Date meetingDate, String address, String hour, String state, String commentary, boolean enabled, String photoname, String photourl) {
        this.id = id;
        this.trainerId = trainerId;
        this.visitorId = visitorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.trainingPurpose = trainingPurpose;
        this.trainingLevel = trainingLevel;
        this.traininPlace = traininPlace;
        this.meetingDate = meetingDate;
        this.address = address;
        this.hour = hour;
        this.state = state;
        this.commentary = commentary;
        this.enabled = enabled;
        this.photoname = photoname;
        this.photourl = photourl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public int getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTrainingPurpose() {
        return trainingPurpose;
    }

    public void setTrainingPurpose(String trainingPurpose) {
        this.trainingPurpose = trainingPurpose;
    }

    public String getTrainingLevel() {
        return trainingLevel;
    }

    public void setTrainingLevel(String trainingLevel) {
        this.trainingLevel = trainingLevel;
    }

    public String getTraininPlace() {
        return traininPlace;
    }

    public void setTraininPlace(String traininPlace) {
        this.traininPlace = traininPlace;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname;
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }
}

