// import java.util.Scanner;
// public class P16 {
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int c=0;
//        for(int i=1;i<=n;i++){
//         if(n%i==0){
//             c=c+1;
//         }
//     }
            
//         if(c==2){
//             System.out.println(" prime number");
//         }
//         else{
//             System.out.println(" not prime");
//         }
       
//     }
    
// }



public class P16{
    public static void main(String[] args) {
        int c=0;
        int n=5;
        int i=1;
        while(n>0 && i<n){
            if(n%i==0){
                c=c+1;
            }
            i++;

        }
        if(c>=2){
            System.out.println("not prime number");
        }
        else{
            System.out.println(" prime");
        }
    }
}