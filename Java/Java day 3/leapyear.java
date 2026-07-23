import java.util.Scanner;
public class leapyear {
    public static void main(String[]args){
        System.out.println("Welcome to leap year checker");
        System.out.println("Enter your birth year to check");
        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();
        if((int)year%4==0){
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
    }

}
