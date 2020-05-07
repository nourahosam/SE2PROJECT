/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se2projectt;



/**
 *
 * @author noura
 */
public class SE2Projectt {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Renter renter = new Renter();
    Reservation r = new Reservation(new BuyApartment(), new Apartment(), renter);
    r.setReservationID(5);
    r.setDurationPerNight(5);
    r.setReservationType('s');
    r.setStartDate("33838");
        
    r.executeStrategy(r.getDurationPerNight(),r.getDurationPerNight(), r.getReservationType(), r.getStartDate());
        
    
    }
    
}
