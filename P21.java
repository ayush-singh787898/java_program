// public class P21 {
//     public static void main(String[] args) {
//         int []a={2,3,4,5,2,3};
//         for(int i:a){
//             System.out.print(i+" ");
//         }  
//     }    
// }


// import java.util.Scanner;
// public class P21 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int [n];
//         for(int i=0;i<n;i++){
//              a[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//         System.out.print(a[i]);  
//         }
//     }    
// }



// import java.util.Scanner;
// public class P21 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int s=0;
//         int a[]=new int [n];
//         for(int i=0;i<n;i++){
//              a[i]=sc.nextInt();
//              s=s+a[i];
//         }
//         for(int i=0;i<n;i++){
//         System.out.print(a[i]+" ");  
//         }
//         System.out.println();
//         System.out.println(s);
//     }    
// }



// import java.util.Scanner;
// public class P21 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int s=0;
//         int a[][]=new int [n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 a[i][j]=sc.nextInt();
//                 s=s+a[i][j];
//             }
            
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(a[i][j]+" ");  
//             }
//         }
//         System.out.println();
//         System.out.println(s);
//     }    
// }


import java.util.Scanner;
public class P21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=0;
        int a[][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
            
        }
        int b[][]=new int [m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                b[i][j]=sc.nextInt();
            }
            
        }
        int c[][]=new int[a.length][b.length];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // s=s+a[i][j]+b[i][j];
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }  
    }    
}



