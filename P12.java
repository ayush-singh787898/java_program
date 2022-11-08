import java.util.Scanner;
public class P12 {
    public static void main(String[] args) {
        System.out.println("Enter the amount");
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        double disc=0;
        double payment=0;
        if(amount>=20000){
            disc=amount*0.1;
            payment =amount-disc;
        System.out.println(payment);
        }
        else if(amount>=10000 && amount<20000){
            disc=amount*0.05;
            payment =amount-disc;
        System.out.println(payment);
        }
        else if(amount>=5000 && amount<10000){
            disc=amount*0.02;
            payment =amount-disc;
        System.out.println(payment);
        }
        else if(amount<5000){
            disc=amount*0;
            payment =amount-disc;
            System.out.println(payment);
        }
    }

    
}
