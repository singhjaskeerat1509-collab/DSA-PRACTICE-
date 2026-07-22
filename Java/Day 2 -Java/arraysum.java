import java.util.Scanner;
public class arraysum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float[] marks= new float[5];
       float sum=0;
       for(int i=0;i<5;i++){
           System.out.println("Enter your "+(i+1)+" number:");
           marks[i]=sc.nextFloat();
           sum+=marks[i];
       }
        System.out.println("sum="+sum);
       sc.close();
    }
}
