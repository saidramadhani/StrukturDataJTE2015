
/**
 * Write a description of class Dokter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dokter{
    
    private Pasien[] pasien;
    String nama;
    
    public Dokter(Pasien[] pasien,String nama){
        this.pasien=pasien;
        this.nama=nama;
  }

    public String getNama(){
        return nama;
    }
}