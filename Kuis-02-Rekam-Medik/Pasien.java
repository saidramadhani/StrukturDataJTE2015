
/**
 * Write a description of class Pasien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pasien{
    
    private Pemeriksaan[] pemeriksaan;
    private Catatan[] catatan; 
    String nama;
    public Pasien(Pemeriksaan[] pemeriksaan, Catatan[] catatan,String nama ){
        this.pemeriksaan=pemeriksaan;
         this.catatan=catatan;
         this.nama=nama;
        }
    
        public String getNama(){
            return nama;
        }
}
