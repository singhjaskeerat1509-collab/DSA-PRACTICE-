
//average of set of numbers passed as arguments//
import java.util.Scanner;
public class AverageOfNumbers {
    static double Average(int...arr){
        int sum=0;
        double result=0;
        for( int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        result=(double)sum/arr.length ;
        return result ;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter your marks:");
        int a=sc.nextInt();

    }
}
