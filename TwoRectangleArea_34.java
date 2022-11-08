public class TwoRectangleArea_34 {
    int l1=4;
    int b1=5;
    int l2=5;
    int b2=8;
    TwoRectangleArea_34(int l1,int b1,int l2,int b2){
         this.l1=l1;
        this.b1=b1;
        this.l2=l2;
        this.b2=b2;
        // Area1();
        // Area2();
    }
    int Area1(){
        int area1=l1*b1;
        return area1;
    }
    int Area2(){
        int area2=l2*b2;
        return area2;
    }
    public static void main(String[] args) {
        TwoRectangleArea_34 t=new TwoRectangleArea_34(4,5,5,8);
        System.out.println(t.Area1());
        System.out.println(t.Area2());
    }
}
