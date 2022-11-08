// public class Rectangle_35 {
    
//


// Area of rectangle

import java.util.*;
public class Rectangle_35 {
    int l;
    int b;
    Rectangle_35(int l,int b){
        this.l=l;
        this.b=b;
        returnArea();      
    }
    int returnArea(){
        int area=l*b;
        return area;
    }
    public static void main(String[] args) {
        System.out.println("Enter length and breadth");
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int bred=sc.nextInt();
        Rectangle_35 t=new Rectangle_35(len,bred);
        System.out.println(t.returnArea());
    }
}



