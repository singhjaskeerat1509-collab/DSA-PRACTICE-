/*find factorial of a number using for loops*/
import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        System.out.print("Enter the number you want factorial of:");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();;
        long factorial=1;
        for(int i=1;i<=a;i++){
            factorial=factorial*i ;

        }
        System.out.println("factorial of "+a+" is:"+factorial);
    }
}
