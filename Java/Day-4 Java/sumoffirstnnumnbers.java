/*sum of first n even number*/

import java.util.Scanner;
public class sumoffirstnnumnbers {
    public static void main(String[] args){
        System.out.println("Enter the value of n");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        int num=2;
        int sum=0;
        while(count<n){
            sum=sum+sum;
            num=num+2;
            count++;
        }
        System.out.println("Sum of first"+n+"even no. is"+sum);
        sc.close();

    }
}

