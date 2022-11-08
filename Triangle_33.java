// import java.util.*;
// public class Rectangle {
//     int l;
//     int b;
//     Rectangle(int l,int b){
//         this.l=l;
//         this.b=b;
//         returnArea();      
//     }
//     int returnArea(){
//         int area=l*b;
//         return area;
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter length and breadth");
//         Scanner sc=new Scanner(System.in);
//         int len=sc.nextInt();
//         int bred=sc.nextInt();
//         Rectangle t=new Rectangle(len,bred);
//         System.out.println(t.returnArea());
//     }
// }


import java.util.*;
public class Triangle_33 {
    int a=3;
    int b=4;
    int c=5;
    Triangle_33(){
        int perimeter=a+b+c;

        int s=perimeter/2;
        // double d=Math.sqrt(perimeter);
        double area=Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        System.out.println("perimeter of triangel is:"+perimeter);
        System.out.println("Area of triangle is: "+area);
    }
    
    public static void main(String[] args) {
        Triangle_33 t=new Triangle_33();
    }
}


// // Area of rectangle

// import java.util.*;
// public class Triangle_35 {
//     int l;
//     int b;
//     Triangle_35(int l,int b){
//         this.l=l;
//         this.b=b;
//         returnArea();      
//     }
//     int returnArea(){
//         int area=l*b;
//         return area;
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter length and breadth");
//         Scanner sc=new Scanner(System.in);
//         int len=sc.nextInt();
//         int bred=sc.nextInt();
//         Triangle_35 t=new Triangle_35(len,bred);
//         System.out.println(t.returnArea());
//     }
// }



