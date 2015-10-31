import java.math.BigDecimal;

/**
 * Write a description of class KoordinatGPS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KoordinatGPS
{
    public KoordinatGPS(){
        this.bujur= new BigDecimal("0");
        this.lintang= new BigDecimal("0");
    }
    
    public KoordinatGPS(double bujur, double lintang){
        this.bujur= new BigDecimal(Double.toString(bujur)) ;
        this.lintang= new BigDecimal (Double.toString(lintang));
    }
    
     public KoordinatGPS(String bujur, String lintang){
        this.bujur= new BigDecimal (bujur.toString());
        this.lintang= new BigDecimal (lintang.toString());
    }
    
    public KoordinatGPS(BigDecimal bujur, BigDecimal lintang){
        this.bujur=bujur;
        this.lintang=lintang;
    }
    
    public String lintangStr(){
        return lintang.toString();
    }
    
    public BigDecimal lintang(){
        return lintang;
    }
    
    public BigDecimal bujur(){
        return bujur;
    }
    
    public String bujurStr(){
        return bujur.toString();
    }
    
    
    private BigDecimal lintang;
    private BigDecimal bujur;
}