//To make reverse star  pattern function//
import java.util.Scanner;

public class ReverseStarPattern {

    static void MakeStar(int a){
        for(int i=a;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter how many row of  stars you want:");
        int a=sc.nextInt();
        System.out.println("Your required pattern is");
        MakeStar(a);

    }
}