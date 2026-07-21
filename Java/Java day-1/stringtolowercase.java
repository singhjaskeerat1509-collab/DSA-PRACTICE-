import java.util.Scanner;


public class stringtolowercase {
    public static void main(String[] args){
        System.out.println("Enter the string you want to convert");
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        String b=a.toLowerCase();
        System.out.println("Your given string in lowercase is"+b);

    }
}
