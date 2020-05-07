/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a_h_s
 */
public class Admin  extends User{
     private String Position;
     static  Admin AdminObj; //consider implementing of read only interface

    private Admin(String Name, int Age, String Email, String Address) { //missing the implementation of singelton pattren
        super(Name, Age, Email, Address);
    }

    private Admin() {
    }

     
    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public static Admin getAdminObj() {
        return AdminObj;
    }

    public static void setAdminObj(Admin AdminObj) {
        Admin.AdminObj = AdminObj;
    }
     
public void NotifyObserver(){

}
   
    
}
