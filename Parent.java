class par{

    par(){
        // m1();
   
        System.out.println("i am in constuctor");
    }
    static void m2(){
        System.out.println("paretnt class: ");
    }
}

public class Parent extends par{
    void m1(){
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        par ab=new par();
        Parent a=new Parent();
        a.m1();
        a.m2();   
    }
}