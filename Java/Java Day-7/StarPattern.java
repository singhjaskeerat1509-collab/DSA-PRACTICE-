//Print the star pattern by making a function//
import java.util.Scanner;
public class StarPattern {
    static void MakeStar(int a){
        for(int i=1;i<=a;i++){
            for(int j=0;j<i;j++){
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
