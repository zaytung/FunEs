package game_db.entity;
// Generated 08-Sep-2012 14:13:48 by Hibernate Tools 3.2.1.GA



/**
 * Score generated by hbm2java
 */
public class Score  implements java.io.Serializable {


     private Integer scoreid;
     private Userlogin userlogin;
     private Dbzone dbzone;
     private int okey;
     private int yuzbir;
     private int kredi;
     private int toplam;

    public Score() {
    }

    public Score(Userlogin userlogin, Dbzone dbzone, int okey, int yuzbir, int kredi, int toplam) {
       this.userlogin = userlogin;
       this.dbzone = dbzone;
       this.okey = okey;
       this.yuzbir = yuzbir;
       this.kredi = kredi;
       this.toplam = toplam;
    }
   
    public Integer getScoreid() {
        return this.scoreid;
    }
    
    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }
    public Userlogin getUserlogin() {
        return this.userlogin;
    }
    
    public void setUserlogin(Userlogin userlogin) {
        this.userlogin = userlogin;
    }
    public Dbzone getDbzone() {
        return this.dbzone;
    }
    
    public void setDbzone(Dbzone dbzone) {
        this.dbzone = dbzone;
    }
    public int getOkey() {
        return this.okey;
    }
    
    public void setOkey(int okey) {
        this.okey = okey;
    }
    public int getYuzbir() {
        return this.yuzbir;
    }
    
    public void setYuzbir(int yuzbir) {
        this.yuzbir = yuzbir;
    }
    public int getKredi() {
        return this.kredi;
    }
    
    public void setKredi(int kredi) {
        this.kredi = kredi;
    }
    public int getToplam() {
        return this.toplam;
    }
    
    public void setToplam(int toplam) {
        this.toplam = toplam;
    }




}

