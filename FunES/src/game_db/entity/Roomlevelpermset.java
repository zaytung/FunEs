package game_db.entity;
// Generated 08-Sep-2012 14:13:48 by Hibernate Tools 3.2.1.GA



/**
 * Roomlevelpermset generated by hbm2java
 */
public class Roomlevelpermset  implements java.io.Serializable {


     private Integer roompermid;
     private Dbroom dbroom;
     private Userlogin userlogin;
     private int permlevel;
     private int atayanuserid;

    public Roomlevelpermset() {
    }

    public Roomlevelpermset(Dbroom dbroom, Userlogin userlogin, int permlevel, int atayanuserid) {
       this.dbroom = dbroom;
       this.userlogin = userlogin;
       this.permlevel = permlevel;
       this.atayanuserid = atayanuserid;
    }
   
    public Integer getRoompermid() {
        return this.roompermid;
    }
    
    public void setRoompermid(Integer roompermid) {
        this.roompermid = roompermid;
    }
    public Dbroom getDbroom() {
        return this.dbroom;
    }
    
    public void setDbroom(Dbroom dbroom) {
        this.dbroom = dbroom;
    }
    public Userlogin getUserlogin() {
        return this.userlogin;
    }
    
    public void setUserlogin(Userlogin userlogin) {
        this.userlogin = userlogin;
    }
    public int getPermlevel() {
        return this.permlevel;
    }
    
    public void setPermlevel(int permlevel) {
        this.permlevel = permlevel;
    }
    public int getAtayanuserid() {
        return this.atayanuserid;
    }
    
    public void setAtayanuserid(int atayanuserid) {
        this.atayanuserid = atayanuserid;
    }




}

