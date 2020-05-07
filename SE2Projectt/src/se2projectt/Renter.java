/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a_h_s
 */
package se2projectt;

public class Renter {
    private Reservation Reservation;

    public Reservation getReserve() {
        return Reservation;
    }

    public void setReserve(Reservation Reservation) {
        this.Reservation= Reservation;
    }
    
    public void  NotifyObserver(){
    }
    
}
