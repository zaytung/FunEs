package game_db.entity;
// Generated 08-Sep-2012 14:13:48 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Dbzone generated by hbm2java
 */
public class Dbzone  implements java.io.Serializable {


     private Integer zoneid;
     private Integer tblhostingid;
     private String zonename;
     private Date yaratimzamani;
     private Date expirezamani;
     private int roomcapacity;
     private BigDecimal zonefiyat;
     private BigDecimal kalanborc;
     private String cpanelusername;
     private String cpanelpassword;
     private Set serverlvlipbans = new HashSet(0);
     private Set scores = new HashSet(0);
     private Set dbrooms = new HashSet(0);
     private Set cafegolds = new HashSet(0);
     private Set userprivatemsglogs = new HashSet(0);
     private Set roompublicmsglogs = new HashSet(0);
     private Set gorevhavuzus = new HashSet(0);
     private Set userlogins = new HashSet(0);
     private Set roomlevelipbans = new HashSet(0);
     private Set serverlvlnickbans = new HashSet(0);
     private Set usercnnlogs = new HashSet(0);

    public Dbzone() {
    }

	
    public Dbzone(String zonename, Date yaratimzamani, Date expirezamani, int roomcapacity, BigDecimal zonefiyat, BigDecimal kalanborc) {
        this.zonename = zonename;
        this.yaratimzamani = yaratimzamani;
        this.expirezamani = expirezamani;
        this.roomcapacity = roomcapacity;
        this.zonefiyat = zonefiyat;
        this.kalanborc = kalanborc;
    }
    public Dbzone(Integer tblhostingid, String zonename, Date yaratimzamani, Date expirezamani, int roomcapacity, BigDecimal zonefiyat, BigDecimal kalanborc, String cpanelusername, String cpanelpassword, Set serverlvlipbans, Set scores, Set dbrooms, Set cafegolds, Set userprivatemsglogs, Set roompublicmsglogs, Set gorevhavuzus, Set userlogins, Set roomlevelipbans, Set serverlvlnickbans, Set usercnnlogs) {
       this.tblhostingid = tblhostingid;
       this.zonename = zonename;
       this.yaratimzamani = yaratimzamani;
       this.expirezamani = expirezamani;
       this.roomcapacity = roomcapacity;
       this.zonefiyat = zonefiyat;
       this.kalanborc = kalanborc;
       this.cpanelusername = cpanelusername;
       this.cpanelpassword = cpanelpassword;
       this.serverlvlipbans = serverlvlipbans;
       this.scores = scores;
       this.dbrooms = dbrooms;
       this.cafegolds = cafegolds;
       this.userprivatemsglogs = userprivatemsglogs;
       this.roompublicmsglogs = roompublicmsglogs;
       this.gorevhavuzus = gorevhavuzus;
       this.userlogins = userlogins;
       this.roomlevelipbans = roomlevelipbans;
       this.serverlvlnickbans = serverlvlnickbans;
       this.usercnnlogs = usercnnlogs;
    }
   
    public Integer getZoneid() {
        return this.zoneid;
    }
    
    public void setZoneid(Integer zoneid) {
        this.zoneid = zoneid;
    }
    public Integer getTblhostingid() {
        return this.tblhostingid;
    }
    
    public void setTblhostingid(Integer tblhostingid) {
        this.tblhostingid = tblhostingid;
    }
    public String getZonename() {
        return this.zonename;
    }
    
    public void setZonename(String zonename) {
        this.zonename = zonename;
    }
    public Date getYaratimzamani() {
        return this.yaratimzamani;
    }
    
    public void setYaratimzamani(Date yaratimzamani) {
        this.yaratimzamani = yaratimzamani;
    }
    public Date getExpirezamani() {
        return this.expirezamani;
    }
    
    public void setExpirezamani(Date expirezamani) {
        this.expirezamani = expirezamani;
    }
    public int getRoomcapacity() {
        return this.roomcapacity;
    }
    
    public void setRoomcapacity(int roomcapacity) {
        this.roomcapacity = roomcapacity;
    }
    public BigDecimal getZonefiyat() {
        return this.zonefiyat;
    }
    
    public void setZonefiyat(BigDecimal zonefiyat) {
        this.zonefiyat = zonefiyat;
    }
    public BigDecimal getKalanborc() {
        return this.kalanborc;
    }
    
    public void setKalanborc(BigDecimal kalanborc) {
        this.kalanborc = kalanborc;
    }
    public String getCpanelusername() {
        return this.cpanelusername;
    }
    
    public void setCpanelusername(String cpanelusername) {
        this.cpanelusername = cpanelusername;
    }
    public String getCpanelpassword() {
        return this.cpanelpassword;
    }
    
    public void setCpanelpassword(String cpanelpassword) {
        this.cpanelpassword = cpanelpassword;
    }
    public Set getServerlvlipbans() {
        return this.serverlvlipbans;
    }
    
    public void setServerlvlipbans(Set serverlvlipbans) {
        this.serverlvlipbans = serverlvlipbans;
    }
    public Set getScores() {
        return this.scores;
    }
    
    public void setScores(Set scores) {
        this.scores = scores;
    }
    public Set getDbrooms() {
        return this.dbrooms;
    }
    
    public void setDbrooms(Set dbrooms) {
        this.dbrooms = dbrooms;
    }
    public Set getCafegolds() {
        return this.cafegolds;
    }
    
    public void setCafegolds(Set cafegolds) {
        this.cafegolds = cafegolds;
    }
    public Set getUserprivatemsglogs() {
        return this.userprivatemsglogs;
    }
    
    public void setUserprivatemsglogs(Set userprivatemsglogs) {
        this.userprivatemsglogs = userprivatemsglogs;
    }
    public Set getRoompublicmsglogs() {
        return this.roompublicmsglogs;
    }
    
    public void setRoompublicmsglogs(Set roompublicmsglogs) {
        this.roompublicmsglogs = roompublicmsglogs;
    }
    public Set getGorevhavuzus() {
        return this.gorevhavuzus;
    }
    
    public void setGorevhavuzus(Set gorevhavuzus) {
        this.gorevhavuzus = gorevhavuzus;
    }
    public Set getUserlogins() {
        return this.userlogins;
    }
    
    public void setUserlogins(Set userlogins) {
        this.userlogins = userlogins;
    }
    public Set getRoomlevelipbans() {
        return this.roomlevelipbans;
    }
    
    public void setRoomlevelipbans(Set roomlevelipbans) {
        this.roomlevelipbans = roomlevelipbans;
    }
    public Set getServerlvlnickbans() {
        return this.serverlvlnickbans;
    }
    
    public void setServerlvlnickbans(Set serverlvlnickbans) {
        this.serverlvlnickbans = serverlvlnickbans;
    }
    public Set getUsercnnlogs() {
        return this.usercnnlogs;
    }
    
    public void setUsercnnlogs(Set usercnnlogs) {
        this.usercnnlogs = usercnnlogs;
    }




}


