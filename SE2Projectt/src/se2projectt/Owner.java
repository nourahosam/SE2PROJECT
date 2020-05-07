/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a_h_s
 */
public class Owner extends User{
    
    private int PostsID;
    private String PostDetails;

    public Owner(int PostsID, String PostDetails, String Name, int Age, String Email, String Address) {
        super(Name, Age, Email, Address);
        this.PostsID = PostsID;
        this.PostDetails = PostDetails;
    }

    public Owner(int PostsID, String PostDetails) {
        this.PostsID = PostsID;
        this.PostDetails = PostDetails;
    }

    public int getPostsID() {
        return PostsID;
    }

    public void setPostsID(int PostsID) {
        this.PostsID = PostsID;
    }

    public String getPostDetails() {
        return PostDetails;
    }

    public void setPostDetails(String PostDetails) {
        this.PostDetails = PostDetails;
    }
    
    
    public void NotifyObserver(){
    }
    
    
    
}
