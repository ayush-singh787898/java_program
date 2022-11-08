import javax.sound.sampled.SourceDataLine;

public class P8 {
    public static void main(String[] args) {
    // byte b=129;
    // System.out.println(b);  // error: incompatible types: possible lossy conversion from int to byte
    byte b=127;
    System.out.println(b);

    short s=b;
    System.out.println(s); 

    int i=23;
    // byte by=i;
    // System.out.println(by); //incompatible types: possible lossy conversion from int to byte

    byte by=(byte)i;
    System.out.println(by); //23

    long l=32482498;
    float f=l;
    System.out.println(f);

    // float f1=394934.394f;
    // long l1=f1;
    // System.out.println(l1);       // incompatible types: possible lossy conversion from float to long

    
    
    }
    
}
