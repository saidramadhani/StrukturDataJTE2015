
/**
 * Write a description of class Node here.
 
 * @version (a version number or a date)
 */

    import java.math.BigInteger;

public class Node {
    public BigInteger data;
    public Node berikut;

    public Node(BigInteger data) {
        this.data = data;
        this.berikut = null;
    }
}

