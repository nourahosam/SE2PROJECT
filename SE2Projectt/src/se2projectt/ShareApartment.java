/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se2projectt;


import java.sql.*;

/**
 *
 * @author noura
 */
public class ShareApartment implements AddReservation{
    public Reservation r;
    private Connection con;
    private final String userName = "root";
    private final String password = "";
    private final String dbName = "se2project";
    

    public ShareApartment() {
      
    }

    @Override
    public Reservation addReservation(int duration, int rID, char rType, String startDate) {
        Connection con;
        con = DBconnect.ConnectDB();
        Reservation r = new Reservation();
        r.setDurationPerNight(duration);
        r.setReservationID(rID);
        r.setReservationType(rType);
        r.setStartDate(startDate);
        
        try
        {
        String query = " insert into Reservation (ReservatiOnID , DurationPerNight, ReservationType, ReservationStartDate) values (?, ?, ?, ?)";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setInt(1, r.getReservationID());
        preparedStmt.setInt (2, r.getDurationPerNight());
        preparedStmt.setString(3, String.valueOf(r.getReservationType()));
        preparedStmt.setString(4, r.getStartDate());
        preparedStmt.execute();
      con = DBconnect.DisconnectDB();
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
