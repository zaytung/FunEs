package game_db.entity;
// Generated 08-Sep-2012 14:13:48 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Roomlevelipban generated by hbm2java
 */
public class Roomlevelipban  implements java.io.Serializable {


     private Integer roomipbanid;
     private Dbroom dbroom;
     private Dbzone dbzone;
     private String bannedip;
     private Date banstart;
     private Date banend;
     private String banreason;

    public Roomlevelipban() {
    }

    public Roomlevelipban(Dbroom dbroom, Dbzone dbzone, String bannedip, Date banstart, Date banend, String banreason) {
       this.dbroom = dbroom;
       this.dbzone = dbzone;
       this.bannedip = bannedip;
       this.banstart = banstart;
       this.banend = banend;
       this.banreason = banreason;
    }
   
    public Integer getRoomipbanid() {
        return this.roomipbanid;
    }
    
    public void setRoomipbanid(Integer roomipbanid) {
        this.roomipbanid = roomipbanid;
    }
    public Dbroom getDbroom() {
        return this.dbroom;
    }
    
    public void setDbroom(Dbroom dbroom) {
        this.dbroom = dbroom;
    }
    public Dbzone getDbzone() {
        return this.dbzone;
    }
    
    public void setDbzone(Dbzone dbzone) {
        this.dbzone = dbzone;
    }
    public String getBannedip() {
        return this.bannedip;
    }
    
    public void setBannedip(String bannedip) {
        this.bannedip = bannedip;
    }
    public Date getBanstart() {
        return this.banstart;
    }
    
    public void setBanstart(Date banstart) {
        this.banstart = banstart;
    }
    public Date getBanend() {
        return this.banend;
    }
    
    public void setBanend(Date banend) {
        this.banend = banend;
    }
    public String getBanreason() {
        return this.banreason;
    }
    
    public void setBanreason(String banreason) {
        this.banreason = banreason;
    }




}


