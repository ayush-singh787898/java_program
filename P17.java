import java.net.SocketTimeoutException;

public class P17 {
    public static void main(String []args){
        int n=5;
        int a=-1;
        int b=1;
        int c;
        int sum=0;
        for(int i=0;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            sum=sum+c;

        }
        System.out.println();
        // System.out.println(sum+" ");
    }
    
}
