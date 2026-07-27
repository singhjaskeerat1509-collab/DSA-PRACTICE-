/*Program to check whether given array is present or not*/
import java.util.Scanner;

public class intpresentinarray {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        int a=sc.nextInt();
        int[] array={34,45,56,12,23,34,556,89,10};
         boolean found=false;
         int index=-1;
         for(int  i=0;i<array.length;i++){
             if(a==array[i]){
                  found = true ;
                  index=i;
                    break;
             }
             else{
                 found=false;
             }
         }
         if(found=true){
             System.out.println("Element is present at:"+index+" position");
         }
         else{
             System.out.println("Element is absent");
         }
    }
}
