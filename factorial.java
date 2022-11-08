// public class factorial {
//     public static void main(String[] args) {
//         int n=5;
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//     System.out.println(fact);
//     }
// }


public class factorial {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int fact=1;
        while(n>0 && i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
