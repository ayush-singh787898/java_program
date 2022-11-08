import java.util.Scanner;
public class P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        String str=String.valueOf(d).replace(".","");
        // int i=Integer.valueOf(str);
        long i=Long.valueOf(str);
        System.out.println(i);
    }
    
}
