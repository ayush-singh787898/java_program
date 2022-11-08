public class P4 {
    public static void main(String[] args) {

        int a=3;
        int b=32;
        System.out.println("Before swapping a and b are :"+a+" "+b);
         a=a^b;
         b=b^a;
         a=a^b;
        System.out.println(a+" "+b);

    }
    
}
