/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se2projectt;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.*;
import java.util.*;


/**
 *
 * @author noura
 */
public class BuyApartment implements AddReservation{
    public Reservation r;
    
    public BuyApartment() {
  
    }

    @Override
    public Reservation addReservation(Reservation r) {
        Connection con;
        con = DBconnect.ConnectDB();
        
        
        //Reservation r = new Reservation();
//        r.setDurationPerNight(duration);
//        r.setReservationID(rID);
//        r.setReservationType(rType);
//        r.setStartDate(startDate);
//        
        try
        {
        String query = " insert into Reservation (ReservatiOnID , Duration, ReservationType, ReservationDate, ReservationReciept) values (?, ?, ?, ?, ?)";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setInt(1, r.getReservationID());
        System.out.println(r.getReservationID());
        preparedStmt.setInt (2, 0);
        preparedStmt.setString(3, String.valueOf(r.getReservationType()));
        preparedStmt.setString(4, r.getStartDate());
        preparedStmt.setString(5, r.getStartDate());
        preparedStmt.execute();
      con = DBconnect.DisconnectDB();
      con.close();
        }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
        System.out.println(e.toString());
    }
  return r;    
    }
}
