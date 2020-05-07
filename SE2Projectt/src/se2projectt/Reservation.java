
package se2projectt;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author noura
 */
public class Reservation {
    private int DurationPerNight; //*
    private int ReservationID; //*
    private char ReservationType; //*
    private String ReservationReciept;
    private String StartDate; //*
    private Apartment ap; //* constructor
    private AddReservation addres;
    private Renter renter; //* constructor
    private String ReservationStatus;
    private int noOfRoomates; //*

    public Reservation(){
        
    }
    public Reservation(AddReservation addres, Apartment p, Renter renter) {
        this.addres = addres;
        this.ap = p;
        this.renter = renter;
    }
    
    
    
    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }
    
    
    
    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }
    

    public Apartment getAp() {
        return ap;
    }

    public void setAp(Apartment ap) {
        this.ap = ap;
    }

    public AddReservation getAddres() {
        return addres;
    }

    public void setAddres(AddReservation addres) {
        this.addres = addres;
    }
    public int getDurationPerNight() {
        return DurationPerNight;
    }

    public void setDurationPerNight(int DurationPerNight) {
        this.DurationPerNight = DurationPerNight;
    }

    public int getReservationID() {
        return ReservationID;
    }

    public void setReservationID(int ReservationID) {
        this.ReservationID = ReservationID;
    }

    public char getReservationType() {
        return ReservationType;
    }

    public void setReservationType(char ReservationType) {
        this.ReservationType = ReservationType;
    }

    public String getReservationReciept() {
        return ReservationReciept;
    }

    public void setReservationReciept(String ReservationReciept) {
        this.ReservationReciept = ReservationReciept;
    }
    
    public void TermsandConditions(){
        
    }
    
    public void Display(){
        
    }
    public void ReservationRequest(){
        
    }  
    public Reservation executeStrategy(Reservation r){
      //this = addres.addReservation(duration, rID, rType, startDate);
        return addres.addReservation(r);
   }
    public void CancelReservation(int n, Apartment p, Renter renter){
        
    }
}