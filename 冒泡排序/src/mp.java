import java.util.Arrays;

public class mp {
   public static void main(String[]args){
       int []a={10,8,18,65,45,78,56};
       for(int i=0;i<a.length-1;i++){
           for(int j=0;j<a.length-1-i;j++){
               int b=0;
               if(a[j]>a[j+1]){
                   b=a[j+1];
                   a[j+1]=a[j];
                   a[j]=b;
               }
           }
       }
       System.out.println(Arrays.toString(a));
   }

}
