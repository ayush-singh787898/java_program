
import java.util.Arrays;

// Recursion:- call a same method inside that method.Due to which stack over flow occurs.
// we have to provide certain condition to execute program.
// Recursion is used in gaming.
// Recursion achieve stack.
// Recurion can also be used in ques.

// public class P24 {
//     static void recursive(int i){
//         // System.out.println("recursive method is running "+i); // descending order natural number
//         if(i>0)
//             recursive(i-1);
//             System.out.println("recursive method is running "+i); // ascending order natural number

//     }
//     public static void main(String[] args) {
//         recursive(10);
//     }
    
// }


// public class Recursion {
//     static void recursive(int i){
//         // System.out.println("recursive method is running"+i);
//         if(i>0)
//             recursive(i-1);
//             System.out.println(i);
//     }
//     public static void main(String[] args) {
//         recursive(10);
//     }   
// }


// public class Recursion {
//     static void recursive(int i){
//         // System.out.println("recursive method is running"+i);
//         if(i>0)
//             recursive(i-1);
//             recursive(i-1);
//             System.out.println(i);
//     }
//     public static void main(String[] args) {
//         recursive(10);
//     }   
// }



//  FACTORIAL PROGRAM using direct recusion


//  direct recusion same method is call inside same method.
public class P24 {
    static int fact(int i){

        if(i>0)
            return i*fact(i-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        // System.out.println(fact(5));
        System.out.println("factorial of "+5+" is:"+fact(5));
    }   
}




// FACTORIAL USING INDIRECT RECURION.

//EXAMPLE
// void m1(){
//     m2();
// }
// void m2(){
//     m1();
// }

// ARRAY LENGTH=SEPERATOR+1

// public class Recursion {
//     // static int str(int [] i.length()){
//     static int str(String str){

//         String[] s=str.split();

//         if(i>0)


//             return i*str(i-1);
//         else
//             return 1;
//     }
//     public static void main(String[] args) {
//         // System.out.println(fact(5));
//         // System.out.println("factorial of "+5+" is:"+fact(5));
//         System.out.println(str("hello world"));
//     }   
// }

// find number of character repeated from a given string.
// public class Recursion {
//     static int count(String str,char sep){
//         int count=0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)==sep)
//             count++;
//         }
//         return count;
//     }
//     static String[] split(String str,char sep){
//         String[] arr=new String[count(str,sep)+1];
//         String st="";
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)==sep){
//                 arr[0]=st; // index number should be increse
//                 st="";
//             }
//             else{
//                 st=st+str.charAt(i);
//             }   
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         System.out.println(count("@aaabbaa",'a'));
//         // System.out.println(Arrays.toString(split()));
//     }   
// }

