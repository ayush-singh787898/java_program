//   class A{
//     void m1(){

//     }
// }
// class B extends A{
//     void m2(){

//     }
// }
//  class program41{
//     public static void main(String[] args) {
        
//     }
// }




import org.w3c.dom.ls.LSOutput;
class Rectangle{
    int l1;
    int l2;
    int b1;
    int b2;
    Rectangle(int l1,int b1,int l2,int b2){
      this.l1=l1;
      this.l2=l2;
      this.b1=b1;
      this.b2=b2;

    }
      int Area1(){
        int area;
        area=l1*b1;
        return  area;

    }
    int Area2(){
      int area=l2*b2;
      return area;
    }
}
public class Program141 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(4,5,5,8);
        System.out.println(r.Area1());
        System.out.println(r.Area2());

    }

}
