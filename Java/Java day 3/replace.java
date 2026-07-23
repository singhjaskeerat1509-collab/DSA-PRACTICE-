/*replacing space with underscore*/
import java.util.Scanner;
public class replace {
    public static String spaces(String a){
        return a.replace(' ','_');
    }
    public static void main(String[]args){
        System.out.println("Enter your Name");
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        System.out.println("Replaced word is:");
        String result=spaces(b);
        System.out.println(result);
    }
}
