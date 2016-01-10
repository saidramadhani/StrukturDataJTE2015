import java.math.BigInteger;
import java.util.Stack;


public class Tumpukan {
    private Node atas;
    private Node bawah;
    
    public Tumpukan() {
    atas = null;
    
    }
    
             public void tumpuk(BigInteger data){
        Node node1 = new Node (data);
        if 
        (atas == null){
        atas = bawah = node1;
        }
        else {
        atas.berikut = node1;
        atas = node1;
            }
        }
    
            public BigInteger ambil(){
        if 
        (atas == null)
        return null;
        else if 
        (atas == bawah){
        atas = null;
        atas = bawah = null;
        }
        else{
        atas = atas.berikut;
        }
        return null;
}

            public BigInteger atas(){
    this.atas = atas;
    return null;
    }
    
            public BigInteger bawah(){
    this.bawah = bawah;
    return null;
    }
}

