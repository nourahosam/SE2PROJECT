/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se2project;

/**
 *
 * @author noura
 */
public class Reservation {
    private int DurationPerNight;
    private int ReservationID;
    private String ReservationType;
    private String ReservationReciept;
    private Apartment ap;

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

    public String getReservationType() {
        return ReservationType;
    }

    public void setReservationType(String ReservationType) {
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
    public void AddReservation(){
        
    }
    public void CancelReservation(){
        
    }
}
