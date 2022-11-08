 class A{
    static void m1(){
        System.out.println("parent class");
    }
}
 class B extends A{
    static void m2(){
        System.out.println("child class");
    }
}
class program41 {
     static void main(String[] args) {
        A obj1=new A();
        obj1.m1();
System.out.println("jfk");
        // B obj2=new B();

        // A obj =new B();
        // B obj =new A();
        // obj.m1();
        // obj.m2();
        
    }   
}
