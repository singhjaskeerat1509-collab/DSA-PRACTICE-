//Create a method to print multiplication table of number n//
import java.util.Scanner;
public class MethodOfTable {
    static void table(int a){
      for(int i=1;i<=10;i++){
            int result=a*i;
            System.out.println(a+"x"+i+"= "+result);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want table of:");
        int a=sc.nextInt();
        System.out.println("The table of this is:");
        table(a);
    }
}
