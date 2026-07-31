import java.util.Scanner;

//Program to find nth term of a fibonacci series//
public class FibonnaciSeries {
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1 ;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[]args){
        System.out.print("Enter the term till you want fibonacci series:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("The series is:"+fib(n));
    }
}
