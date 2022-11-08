class parent {
    void m1(){
        System.out.println("This is parent class");
    }
}
class child extends parent{
    void m2(){
        System.out.println("this is child class");
    }
}
class p43{
    public static void main(String[] args) {
        child c=new child();
        c.m1();
        c.m2();
    }
}    

