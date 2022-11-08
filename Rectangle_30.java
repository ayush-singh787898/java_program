import java.util.Scanner;
public class Rectangle_30 {
    int l1;
    int l2;
    void setDim(int l,int b){
        this.l1=l;
        this.l2=b;
        getArea();
    }
    int getArea(){ 
        int area=l1*l2;
        return area;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth");
        Scanner sc=new Scanner(System.in);
        int l1=sc.nextInt();
        int b1=sc.nextInt();
        Rectangle_30 obj=new Rectangle_30();
        obj.setDim(l1,b1);
        System.out.println("Area of rectangle is:"+obj.getArea());
    }
}
