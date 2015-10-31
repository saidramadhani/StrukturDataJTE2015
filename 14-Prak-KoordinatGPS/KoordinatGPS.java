
/**
 * Write a description of class KoordinatGPS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KoordinatGPS
{
     private Double lintang;
     private Double bujur;
    
    public KoordinatGPS(){
        this.lintang = new Double(0.0);
        this.bujur = new Double(0.0);
    }
    
     public KoordinatGPS(double bujur, double lintang) {
       this.bujur = bujur;
       this.lintang = lintang;
    }
     public KoordinatGPS(Double bujur, Double lintang) {
       this.bujur = bujur;
       this.lintang = lintang;
    }
    
    

    public Double lintang() {
        return lintang;
    }
    public Double bujur() {
        return bujur;
    }
    
}    
    
