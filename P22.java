public class P22 {
    public static void main(String[] args) {
        int a[]={31,4,53,32,52,13};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++)
            if(a[i]<a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            }
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
